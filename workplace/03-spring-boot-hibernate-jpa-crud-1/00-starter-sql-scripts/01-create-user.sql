----------------------------------------------------
-- 1. Drop the role (user) if it already exists
----------------------------------------------------
DO
$$
BEGIN
   IF EXISTS (SELECT FROM pg_roles WHERE rolname = 'springstudent') THEN
      -- (Optional) terminate any open sessions owned by the role
      PERFORM pg_terminate_backend(pid)
      FROM   pg_stat_activity
      WHERE  usename = 'springstudent';

      DROP ROLE springstudent;
   END IF;
END
$$;

----------------------------------------------------
-- 2. Create the login role
----------------------------------------------------
CREATE ROLE springstudent
  LOGIN
  PASSWORD 'springstudent';

----------------------------------------------------
-- 3. Grant privileges
--    PostgreSQL does NOT have a single “GRANT ALL ON *.*”
--    like MySQL.  You grant database‑level rights, and then
--    object‑level rights per schema.
----------------------------------------------------

-- 3‑a.  If you already have a database you want the user to hit:
GRANT ALL PRIVILEGES ON DATABASE your_database_name TO springstudent;

-- 3‑b.  Grant on all current tables/sequences/functions in `public`
GRANT ALL PRIVILEGES ON ALL TABLES     IN SCHEMA public TO springstudent;
GRANT ALL PRIVILEGES ON ALL SEQUENCES  IN SCHEMA public TO springstudent;
GRANT ALL PRIVILEGES ON ALL FUNCTIONS  IN SCHEMA public TO springstudent;

-- 3‑c.  Make future objects in `public` automatically owned:
ALTER DEFAULT PRIVILEGES IN SCHEMA public
       GRANT ALL PRIVILEGES ON TABLES    TO springstudent;
ALTER DEFAULT PRIVILEGES IN SCHEMA public
       GRANT ALL PRIVILEGES ON SEQUENCES TO springstudent;
