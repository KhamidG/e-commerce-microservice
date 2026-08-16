create table  (
                               id              uuid primary key,
                               aggregate_type  varchar(64) not null,
                               aggregate_id    uuid not null,
                               event_type      varchar(64) not null,
                               payload         jsonb not null,
                               created_at      timestamptz not null,
                               published       boolean not null default false,
                               published_at    timestamptz
);