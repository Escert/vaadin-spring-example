CREATE TABLE performance
(
    id IDENTITY NOT NULL PRIMARY KEY,
    created_on TIMESTAMP WITH TIME ZONE  NOT NULL,
    opt_lock BIGINT NOT NULL,
    total_memory BIGINT NOT NULL,
    free_memory BIGINT NOT NULL
)