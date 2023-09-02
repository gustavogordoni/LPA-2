PGDMP         3                y            projeto_locadora_lpa_2020    13.1    13.0 #    �           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            �           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            �           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            �           1262    16394    projeto_locadora_lpa_2020    DATABASE     y   CREATE DATABASE projeto_locadora_lpa_2020 WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'Portuguese_Brazil.1252';
 )   DROP DATABASE projeto_locadora_lpa_2020;
                postgres    false            �            1259    16395    carro    TABLE     �   CREATE TABLE public.carro (
    id_car integer NOT NULL,
    pla_car character varying(8),
    ano_car integer,
    mar_car character varying(30),
    des_car character varying(200)
);
    DROP TABLE public.carro;
       public         heap    postgres    false            �            1259    16398    carro_id_car_seq    SEQUENCE     �   CREATE SEQUENCE public.carro_id_car_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 '   DROP SEQUENCE public.carro_id_car_seq;
       public          postgres    false    200            �           0    0    carro_id_car_seq    SEQUENCE OWNED BY     E   ALTER SEQUENCE public.carro_id_car_seq OWNED BY public.carro.id_car;
          public          postgres    false    201            �            1259    16400    locacao    TABLE     �   CREATE TABLE public.locacao (
    id_locacao integer NOT NULL,
    id_car integer,
    id_pes integer,
    dat_ini_locacao date,
    dat_fim_locacao date,
    km_ini_locacao integer,
    km_fim_locacao integer,
    obs_locacao character varying(200)
);
    DROP TABLE public.locacao;
       public         heap    postgres    false            �            1259    16403    carro_locacao_id_car_loc_seq    SEQUENCE     �   CREATE SEQUENCE public.carro_locacao_id_car_loc_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 3   DROP SEQUENCE public.carro_locacao_id_car_loc_seq;
       public          postgres    false    202            �           0    0    carro_locacao_id_car_loc_seq    SEQUENCE OWNED BY     W   ALTER SEQUENCE public.carro_locacao_id_car_loc_seq OWNED BY public.locacao.id_locacao;
          public          postgres    false    203            �            1259    16405    funcionario    TABLE     �   CREATE TABLE public.funcionario (
    log_fun character varying(20),
    sen_fun character varying(200),
    id_pes integer NOT NULL
);
    DROP TABLE public.funcionario;
       public         heap    postgres    false            �            1259    16408    locador    TABLE     S   CREATE TABLE public.locador (
    id_pes integer NOT NULL,
    val_cnh_loc date
);
    DROP TABLE public.locador;
       public         heap    postgres    false            �            1259    16411    pessoa    TABLE     �  CREATE TABLE public.pessoa (
    id_pes integer NOT NULL,
    cpf_cnpj_pes character varying(18),
    rg_ie_pes character varying(20),
    nom_pes character varying(50),
    end_pes character varying(50),
    num_pes integer,
    bai_pes character varying(30),
    cid_pes character varying(30),
    est_pes character varying(2),
    cep_pes character varying(10),
    tip_pes integer
);
    DROP TABLE public.pessoa;
       public         heap    postgres    false            �            1259    16414    locador_id_pes_seq    SEQUENCE     �   CREATE SEQUENCE public.locador_id_pes_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 )   DROP SEQUENCE public.locador_id_pes_seq;
       public          postgres    false    206            �           0    0    locador_id_pes_seq    SEQUENCE OWNED BY     H   ALTER SEQUENCE public.locador_id_pes_seq OWNED BY public.pessoa.id_pes;
          public          postgres    false    207            6           2604    16416    carro id_car    DEFAULT     l   ALTER TABLE ONLY public.carro ALTER COLUMN id_car SET DEFAULT nextval('public.carro_id_car_seq'::regclass);
 ;   ALTER TABLE public.carro ALTER COLUMN id_car DROP DEFAULT;
       public          postgres    false    201    200            7           2604    16417    locacao id_locacao    DEFAULT     ~   ALTER TABLE ONLY public.locacao ALTER COLUMN id_locacao SET DEFAULT nextval('public.carro_locacao_id_car_loc_seq'::regclass);
 A   ALTER TABLE public.locacao ALTER COLUMN id_locacao DROP DEFAULT;
       public          postgres    false    203    202            8           2604    16418    pessoa id_pes    DEFAULT     o   ALTER TABLE ONLY public.pessoa ALTER COLUMN id_pes SET DEFAULT nextval('public.locador_id_pes_seq'::regclass);
 <   ALTER TABLE public.pessoa ALTER COLUMN id_pes DROP DEFAULT;
       public          postgres    false    207    206            �          0    16395    carro 
   TABLE DATA           K   COPY public.carro (id_car, pla_car, ano_car, mar_car, des_car) FROM stdin;
    public          postgres    false    200   Q(       �          0    16405    funcionario 
   TABLE DATA           ?   COPY public.funcionario (log_fun, sen_fun, id_pes) FROM stdin;
    public          postgres    false    204   �(       �          0    16400    locacao 
   TABLE DATA           �   COPY public.locacao (id_locacao, id_car, id_pes, dat_ini_locacao, dat_fim_locacao, km_ini_locacao, km_fim_locacao, obs_locacao) FROM stdin;
    public          postgres    false    202   )       �          0    16408    locador 
   TABLE DATA           6   COPY public.locador (id_pes, val_cnh_loc) FROM stdin;
    public          postgres    false    205   ?)       �          0    16411    pessoa 
   TABLE DATA           �   COPY public.pessoa (id_pes, cpf_cnpj_pes, rg_ie_pes, nom_pes, end_pes, num_pes, bai_pes, cid_pes, est_pes, cep_pes, tip_pes) FROM stdin;
    public          postgres    false    206   s)       �           0    0    carro_id_car_seq    SEQUENCE SET     >   SELECT pg_catalog.setval('public.carro_id_car_seq', 5, true);
          public          postgres    false    201            �           0    0    carro_locacao_id_car_loc_seq    SEQUENCE SET     J   SELECT pg_catalog.setval('public.carro_locacao_id_car_loc_seq', 1, true);
          public          postgres    false    203            �           0    0    locador_id_pes_seq    SEQUENCE SET     A   SELECT pg_catalog.setval('public.locador_id_pes_seq', 20, true);
          public          postgres    false    207            <           2606    16420    locacao carro_locacao_pkey 
   CONSTRAINT     `   ALTER TABLE ONLY public.locacao
    ADD CONSTRAINT carro_locacao_pkey PRIMARY KEY (id_locacao);
 D   ALTER TABLE ONLY public.locacao DROP CONSTRAINT carro_locacao_pkey;
       public            postgres    false    202            :           2606    16422    carro carro_pkey 
   CONSTRAINT     R   ALTER TABLE ONLY public.carro
    ADD CONSTRAINT carro_pkey PRIMARY KEY (id_car);
 :   ALTER TABLE ONLY public.carro DROP CONSTRAINT carro_pkey;
       public            postgres    false    200            >           2606    16424    funcionario funcionario_pkey 
   CONSTRAINT     ^   ALTER TABLE ONLY public.funcionario
    ADD CONSTRAINT funcionario_pkey PRIMARY KEY (id_pes);
 F   ALTER TABLE ONLY public.funcionario DROP CONSTRAINT funcionario_pkey;
       public            postgres    false    204            B           2606    16426    pessoa locador_pkey 
   CONSTRAINT     U   ALTER TABLE ONLY public.pessoa
    ADD CONSTRAINT locador_pkey PRIMARY KEY (id_pes);
 =   ALTER TABLE ONLY public.pessoa DROP CONSTRAINT locador_pkey;
       public            postgres    false    206            @           2606    16428    locador locador_pkey1 
   CONSTRAINT     W   ALTER TABLE ONLY public.locador
    ADD CONSTRAINT locador_pkey1 PRIMARY KEY (id_pes);
 ?   ALTER TABLE ONLY public.locador DROP CONSTRAINT locador_pkey1;
       public            postgres    false    205            C           2606    16429 !   locacao carro_locacao_id_car_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.locacao
    ADD CONSTRAINT carro_locacao_id_car_fkey FOREIGN KEY (id_car) REFERENCES public.carro(id_car);
 K   ALTER TABLE ONLY public.locacao DROP CONSTRAINT carro_locacao_id_car_fkey;
       public          postgres    false    200    2874    202            D           2606    16434 !   locacao carro_locacao_id_loc_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.locacao
    ADD CONSTRAINT carro_locacao_id_loc_fkey FOREIGN KEY (id_pes) REFERENCES public.pessoa(id_pes);
 K   ALTER TABLE ONLY public.locacao DROP CONSTRAINT carro_locacao_id_loc_fkey;
       public          postgres    false    202    206    2882            E           2606    16439    funcionario id_pes    FK CONSTRAINT        ALTER TABLE ONLY public.funcionario
    ADD CONSTRAINT id_pes FOREIGN KEY (id_pes) REFERENCES public.pessoa(id_pes) NOT VALID;
 <   ALTER TABLE ONLY public.funcionario DROP CONSTRAINT id_pes;
       public          postgres    false    204    206    2882            F           2606    16444    locador locador_id_pes_fkey    FK CONSTRAINT     ~   ALTER TABLE ONLY public.locador
    ADD CONSTRAINT locador_id_pes_fkey FOREIGN KEY (id_pes) REFERENCES public.pessoa(id_pes);
 E   ALTER TABLE ONLY public.locador DROP CONSTRAINT locador_id_pes_fkey;
       public          postgres    false    2882    205    206            �   m   x�-�1�0�W�"�(��>#�$l�����8R��(�x��R��y�-�%�&�Xy�(��後���:�1��MxH�ᦵ){zAU�i��~����"�?      �   #   x�K+�K���K,��7�442615�4����� {��      �   .   x�3�4�44�4202�50�5��0A�������D��W� �~R      �   $   x�34�4202�5".#NCKsK ċ���� `�s      �   �   x���K�0D��)�@�q�6)Hٴ(�;�&声=M�/�01sz%2S���:��^˲c��c:y���2�t��v�O*k׳�wu����>���?���f��"҄�� �D$"�@
�q�0T��F�=�T�20     