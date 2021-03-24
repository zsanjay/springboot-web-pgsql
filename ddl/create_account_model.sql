--
-- PostgreSQL database dump
--

-- Dumped from database version 12.6 (Ubuntu 12.6-1.pgdg18.04+1)
-- Dumped by pg_dump version 12.6 (Ubuntu 12.6-1.pgdg18.04+1)

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- Name: account; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.account (
    id integer NOT NULL,
    name character varying(255) NOT NULL,
    full_name character varying(255) NOT NULL,
    login character varying(255) NOT NULL,
    email character varying(255)
);


ALTER TABLE public.account OWNER TO postgres;

--
-- Name: account_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.account_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.account_id_seq OWNER TO postgres;

--
-- Name: account_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.account_id_seq OWNED BY public.account.id;


--
-- Name: account id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.account ALTER COLUMN id SET DEFAULT nextval('public.account_id_seq'::regclass);


--
-- Data for Name: account; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.account (id, name, full_name, login, email) FROM stdin;
1       Devid   Devid Brain     dbrain  dbrain@mail.com
2       Mikle   Mikle Force     force   force1@mail.com
3       Alisha  Alisha Brain    ali     Alisha@mail.com
4       Kris    Kris Lyn        lyn     lyn@mail.com
5       Marcus  Marcus Mo       marcusMo        mmo@mail.com
6       Trish   Trish Devidson  tdev    tdev@mail.com
7       Ronny   Ronny Fox       rnnf    rnnf@mail.com
8       Amber   Amber Scott     asct    asct@mail.com
9       Alain   Alain White     alain   alain@mail.com
10      Kira    Kira Loft       kloft   loft@mail.com
\.


--
-- Name: account_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.account_id_seq', 1, false);


--
-- Name: account account_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.account
    ADD CONSTRAINT account_pkey PRIMARY KEY (id);


--
-- PostgreSQL database dump complete
--

