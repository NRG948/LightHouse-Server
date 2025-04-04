-- H2 2.3.232;
;
CREATE USER IF NOT EXISTS "SA" SALT '00600e5bf18e74b3' HASH '7ab1b110f6de24cb25e4d33337f03ec9dfe4946c790e312ddc7edd48a22523de' ADMIN;
CREATE SEQUENCE IF NOT EXISTS "PUBLIC"."ATLAS_ENTRY_SEQ" START WITH 1 RESTART WITH 551 INCREMENT BY 50;
CREATE SEQUENCE IF NOT EXISTS "PUBLIC"."BLUE_MATCH_ALLIANCE_SEQ" START WITH 1 RESTART WITH 1601 INCREMENT BY 50;
CREATE SEQUENCE IF NOT EXISTS "PUBLIC"."BLUE_SCORE_BREAKDOWN_ALLIANCE2025_SEQ" START WITH 1 RESTART WITH 1601 INCREMENT BY 50;
CREATE SEQUENCE IF NOT EXISTS "PUBLIC"."BOT_NODES_INFO_SEQ" START WITH 1 RESTART WITH 1601 INCREMENT BY 50;
CREATE SEQUENCE IF NOT EXISTS "PUBLIC"."CHRONOS_ENTRY_SEQ" START WITH 1 INCREMENT BY 50;
CREATE SEQUENCE IF NOT EXISTS "PUBLIC"."DATA_FLAG_ENTRY_SEQ" START WITH 1 INCREMENT BY 50;
CREATE SEQUENCE IF NOT EXISTS "PUBLIC"."HPENTRY_SEQ" START WITH 1 INCREMENT BY 50;
CREATE SEQUENCE IF NOT EXISTS "PUBLIC"."MATCH_ALLIANCES_SEQ" START WITH 1 RESTART WITH 1601 INCREMENT BY 50;
CREATE SEQUENCE IF NOT EXISTS "PUBLIC"."MID_NODES_INFO_SEQ" START WITH 1 RESTART WITH 1601 INCREMENT BY 50;
CREATE SEQUENCE IF NOT EXISTS "PUBLIC"."PATCH_ENTRY_SEQ" START WITH 1 INCREMENT BY 50;
CREATE SEQUENCE IF NOT EXISTS "PUBLIC"."PIT_ENTRY_SEQ" START WITH 1 RESTART WITH 101 INCREMENT BY 50;
CREATE SEQUENCE IF NOT EXISTS "PUBLIC"."RED_MATCH_ALLIANCE_SEQ" START WITH 1 RESTART WITH 1601 INCREMENT BY 50;
CREATE SEQUENCE IF NOT EXISTS "PUBLIC"."RED_SCORE_BREAKDOWN_ALLIANCE2025_SEQ" START WITH 1 RESTART WITH 1601 INCREMENT BY 50;
CREATE SEQUENCE IF NOT EXISTS "PUBLIC"."REEF_INFO_SEQ" START WITH 1 RESTART WITH 1601 INCREMENT BY 50;
CREATE SEQUENCE IF NOT EXISTS "PUBLIC"."SCORE_BREAKDOWN2025_SEQ" START WITH 1 RESTART WITH 1601 INCREMENT BY 50;
CREATE SEQUENCE IF NOT EXISTS "PUBLIC"."TOP_NODES_INFO_SEQ" START WITH 1 RESTART WITH 1601 INCREMENT BY 50;
CREATE GLOBAL TEMPORARY TABLE IF NOT EXISTS "PUBLIC"."HTE_RED_MATCH_ALLIANCE"(
    "RN_" INTEGER NOT NULL,
    "SCORE" INTEGER,
    "ID" BIGINT,
    "DQ_TEAM_KEYS" CHARACTER VARYING(255) ARRAY,
    "SURROGATE_TEAM_KEYS" CHARACTER VARYING(255) ARRAY,
    "TEAM_KEYS" CHARACTER VARYING(255) ARRAY
);
ALTER TABLE "PUBLIC"."HTE_RED_MATCH_ALLIANCE" ADD CONSTRAINT IF NOT EXISTS "PUBLIC"."CONSTRAINT_1" PRIMARY KEY("RN_");
-- 0 +/- SELECT COUNT(*) FROM PUBLIC.HTE_RED_MATCH_ALLIANCE;
CREATE GLOBAL TEMPORARY TABLE IF NOT EXISTS "PUBLIC"."HTE_BLUE_SCORE_BREAKDOWN_ALLIANCE2025"(
    "ADJUST_POINTS" INTEGER,
    "ALGAE_POINTS" INTEGER,
    "AUTO_BONUS_ACHIEVED" BOOLEAN,
    "AUTO_CORAL_COUNT" INTEGER,
    "AUTO_CORAL_POINTS" INTEGER,
    "AUTO_MOBILITY_POINTS" INTEGER,
    "AUTO_POINTS" INTEGER,
    "BARGE_BONUS_ACHIEVED" BOOLEAN,
    "COOPERTITION_CRITERIA_MET" BOOLEAN,
    "CORAL_BONUS_ACHIEVED" BOOLEAN,
    "END_GAME_BARGE_POINTS" INTEGER,
    "FOUL_COUNT" INTEGER,
    "FOUL_POINTS" INTEGER,
    "G206PENALTY" BOOLEAN,
    "G410PENALTY" BOOLEAN,
    "G418PENALTY" BOOLEAN,
    "G428PENALTY" BOOLEAN,
    "NET_ALGAE_COUNT" INTEGER,
    "RN_" INTEGER NOT NULL,
    "RP" INTEGER,
    "TECH_FOUL_COUNT" INTEGER,
    "TELEOP_CORAL_COUNT" INTEGER,
    "TELEOP_CORAL_POINTS" INTEGER,
    "TELEOP_POINTS" INTEGER,
    "TOTAL_POINTS" INTEGER,
    "WALL_ALGAE_COUNT" INTEGER,
    "AUTO_REEF_ID" BIGINT,
    "ID" BIGINT,
    "TELEOP_REEF_ID" BIGINT,
    "AUTO_LINE_ROBOT1" CHARACTER VARYING(255),
    "AUTO_LINE_ROBOT2" CHARACTER VARYING(255),
    "AUTO_LINE_ROBOT3" CHARACTER VARYING(255),
    "END_GAME_ROBOT1" CHARACTER VARYING(255),
    "END_GAME_ROBOT2" CHARACTER VARYING(255),
    "END_GAME_ROBOT3" CHARACTER VARYING(255)
);
ALTER TABLE "PUBLIC"."HTE_BLUE_SCORE_BREAKDOWN_ALLIANCE2025" ADD CONSTRAINT IF NOT EXISTS "PUBLIC"."CONSTRAINT_9" PRIMARY KEY("RN_");
-- 0 +/- SELECT COUNT(*) FROM PUBLIC.HTE_BLUE_SCORE_BREAKDOWN_ALLIANCE2025;
CREATE GLOBAL TEMPORARY TABLE IF NOT EXISTS "PUBLIC"."HTE_MID_NODES_INFO"(
    "NODEA" BOOLEAN,
    "NODEB" BOOLEAN,
    "NODEC" BOOLEAN,
    "NODED" BOOLEAN,
    "NODEE" BOOLEAN,
    "NODEF" BOOLEAN,
    "NODEG" BOOLEAN,
    "NODEH" BOOLEAN,
    "NODEI" BOOLEAN,
    "NODEJ" BOOLEAN,
    "NODEK" BOOLEAN,
    "NODEL" BOOLEAN,
    "RN_" INTEGER NOT NULL,
    "ID" BIGINT
);
ALTER TABLE "PUBLIC"."HTE_MID_NODES_INFO" ADD CONSTRAINT IF NOT EXISTS "PUBLIC"."CONSTRAINT_C" PRIMARY KEY("RN_");
-- 0 +/- SELECT COUNT(*) FROM PUBLIC.HTE_MID_NODES_INFO;
CREATE GLOBAL TEMPORARY TABLE IF NOT EXISTS "PUBLIC"."HTE_PATCH_ENTRY"(
    "MATCH_NUMBER" INTEGER,
    "REPLAY" BOOLEAN,
    "RN_" INTEGER NOT NULL,
    "TEAM_NUMBER" INTEGER,
    "ID" BIGINT,
    "COMMENTS" CHARACTER VARYING(255),
    "DATA_TYPE" CHARACTER VARYING(255),
    "DRIVER_STATION" CHARACTER VARYING(255),
    "MATCH_TYPE" CHARACTER VARYING(255),
    "PATCHER" CHARACTER VARYING(255)
);
ALTER TABLE "PUBLIC"."HTE_PATCH_ENTRY" ADD CONSTRAINT IF NOT EXISTS "PUBLIC"."CONSTRAINT_7" PRIMARY KEY("RN_");
-- 0 +/- SELECT COUNT(*) FROM PUBLIC.HTE_PATCH_ENTRY;
CREATE GLOBAL TEMPORARY TABLE IF NOT EXISTS "PUBLIC"."HTE_BLUE_MATCH_ALLIANCE"(
    "RN_" INTEGER NOT NULL,
    "SCORE" INTEGER,
    "ID" BIGINT,
    "DQ_TEAM_KEYS" CHARACTER VARYING(255) ARRAY,
    "SURROGATE_TEAM_KEYS" CHARACTER VARYING(255) ARRAY,
    "TEAM_KEYS" CHARACTER VARYING(255) ARRAY
);
ALTER TABLE "PUBLIC"."HTE_BLUE_MATCH_ALLIANCE" ADD CONSTRAINT IF NOT EXISTS "PUBLIC"."CONSTRAINT_F" PRIMARY KEY("RN_");
-- 0 +/- SELECT COUNT(*) FROM PUBLIC.HTE_BLUE_MATCH_ALLIANCE;
CREATE GLOBAL TEMPORARY TABLE IF NOT EXISTS "PUBLIC"."HTE_TOP_NODES_INFO"(
    "NODEA" BOOLEAN,
    "NODEB" BOOLEAN,
    "NODEC" BOOLEAN,
    "NODED" BOOLEAN,
    "NODEE" BOOLEAN,
    "NODEF" BOOLEAN,
    "NODEG" BOOLEAN,
    "NODEH" BOOLEAN,
    "NODEI" BOOLEAN,
    "NODEJ" BOOLEAN,
    "NODEK" BOOLEAN,
    "NODEL" BOOLEAN,
    "RN_" INTEGER NOT NULL,
    "ID" BIGINT
);
ALTER TABLE "PUBLIC"."HTE_TOP_NODES_INFO" ADD CONSTRAINT IF NOT EXISTS "PUBLIC"."CONSTRAINT_E" PRIMARY KEY("RN_");
-- 0 +/- SELECT COUNT(*) FROM PUBLIC.HTE_TOP_NODES_INFO;
CREATE GLOBAL TEMPORARY TABLE IF NOT EXISTS "PUBLIC"."HTE_RED_SCORE_BREAKDOWN_ALLIANCE2025"(
    "ADJUST_POINTS" INTEGER,
    "ALGAE_POINTS" INTEGER,
    "AUTO_BONUS_ACHIEVED" BOOLEAN,
    "AUTO_CORAL_COUNT" INTEGER,
    "AUTO_CORAL_POINTS" INTEGER,
    "AUTO_MOBILITY_POINTS" INTEGER,
    "AUTO_POINTS" INTEGER,
    "BARGE_BONUS_ACHIEVED" BOOLEAN,
    "COOPERTITION_CRITERIA_MET" BOOLEAN,
    "CORAL_BONUS_ACHIEVED" BOOLEAN,
    "END_GAME_BARGE_POINTS" INTEGER,
    "FOUL_COUNT" INTEGER,
    "FOUL_POINTS" INTEGER,
    "G206PENALTY" BOOLEAN,
    "G410PENALTY" BOOLEAN,
    "G418PENALTY" BOOLEAN,
    "G428PENALTY" BOOLEAN,
    "NET_ALGAE_COUNT" INTEGER,
    "RN_" INTEGER NOT NULL,
    "RP" INTEGER,
    "TECH_FOUL_COUNT" INTEGER,
    "TELEOP_CORAL_COUNT" INTEGER,
    "TELEOP_CORAL_POINTS" INTEGER,
    "TELEOP_POINTS" INTEGER,
    "TOTAL_POINTS" INTEGER,
    "WALL_ALGAE_COUNT" INTEGER,
    "AUTO_REEF_ID" BIGINT,
    "ID" BIGINT,
    "TELEOP_REEF_ID" BIGINT,
    "AUTO_LINE_ROBOT1" CHARACTER VARYING(255),
    "AUTO_LINE_ROBOT2" CHARACTER VARYING(255),
    "AUTO_LINE_ROBOT3" CHARACTER VARYING(255),
    "END_GAME_ROBOT1" CHARACTER VARYING(255),
    "END_GAME_ROBOT2" CHARACTER VARYING(255),
    "END_GAME_ROBOT3" CHARACTER VARYING(255)
);
ALTER TABLE "PUBLIC"."HTE_RED_SCORE_BREAKDOWN_ALLIANCE2025" ADD CONSTRAINT IF NOT EXISTS "PUBLIC"."CONSTRAINT_9A" PRIMARY KEY("RN_");
-- 0 +/- SELECT COUNT(*) FROM PUBLIC.HTE_RED_SCORE_BREAKDOWN_ALLIANCE2025;
CREATE GLOBAL TEMPORARY TABLE IF NOT EXISTS "PUBLIC"."HTE_DATA_FLAG_ENTRY"(
    "MATCH_NUMBER" INTEGER,
    "REPLAY" BOOLEAN,
    "RN_" INTEGER NOT NULL,
    "ID" BIGINT,
    "DRIVER_STATION" CHARACTER VARYING(255),
    "FLAG" CHARACTER VARYING(255),
    "FLAG_TYPE" CHARACTER VARYING(255),
    "LAYOUT" CHARACTER VARYING(255),
    "MATCH_TYPE" CHARACTER VARYING(255)
);
ALTER TABLE "PUBLIC"."HTE_DATA_FLAG_ENTRY" ADD CONSTRAINT IF NOT EXISTS "PUBLIC"."CONSTRAINT_FC" PRIMARY KEY("RN_");
-- 0 +/- SELECT COUNT(*) FROM PUBLIC.HTE_DATA_FLAG_ENTRY;
CREATE GLOBAL TEMPORARY TABLE IF NOT EXISTS "PUBLIC"."HTE_MATCH_ALLIANCES"(
    "RN_" INTEGER NOT NULL,
    "BLUE_ID" BIGINT,
    "ID" BIGINT,
    "RED_ID" BIGINT
);
ALTER TABLE "PUBLIC"."HTE_MATCH_ALLIANCES" ADD CONSTRAINT IF NOT EXISTS "PUBLIC"."CONSTRAINT_A" PRIMARY KEY("RN_");
-- 0 +/- SELECT COUNT(*) FROM PUBLIC.HTE_MATCH_ALLIANCES;
CREATE GLOBAL TEMPORARY TABLE IF NOT EXISTS "PUBLIC"."HTE_ATLAS_ENTRY"(
    "ACCURATE_CLIMB" BOOLEAN,
    "ALGAE_MISS_NET" INTEGER,
    "ALGAE_MISS_PROCESSOR" INTEGER,
    "ALGAE_PICKUPS" INTEGER,
    "ALGAE_REMOVE" INTEGER,
    "ALGAE_SCORE_NET" INTEGER,
    "ALGAE_SCORE_PROCESSOR" INTEGER,
    "ALGAEREMOVEL2" INTEGER,
    "ALGAEREMOVEL3" INTEGER,
    "ATTEMPTED_CLIMB" BOOLEAN,
    "BARGECS" BOOLEAN,
    "CLIMB_START_TIME" INTEGER,
    "CORAL_PICKUPS" INTEGER,
    "CORAL_PICKUPS_GROUND" INTEGER,
    "CORAL_PICKUPS_STATION" INTEGER,
    "CORAL_SCOREDL1" INTEGER,
    "CORAL_SCOREDL2" INTEGER,
    "CORAL_SCOREDL3" INTEGER,
    "CORAL_SCOREDL4" INTEGER,
    "CROSSED_MIDLINE" BOOLEAN,
    "DATA_QUALITY" INTEGER,
    "GROUND_INTAKE" BOOLEAN,
    "HAS_NO_AUTO" BOOLEAN,
    "MATCH_NUMBER" INTEGER,
    "PRELOAD" BOOLEAN,
    "PROCESSORCS" BOOLEAN,
    "REPLAY" BOOLEAN,
    "RN_" INTEGER NOT NULL,
    "ROBOT_DISABLED" BOOLEAN,
    "TEAM_NUMBER" INTEGER,
    "ID" BIGINT,
    "AUTO_CORAL_SCOREDL1" CHARACTER VARYING(255),
    "COMMENTS" CHARACTER VARYING(255),
    "DEFENSE_RATING" CHARACTER VARYING(255),
    "DRIVER_STATION" CHARACTER VARYING(255),
    "END_LOCATION" CHARACTER VARYING(255),
    "EXPORT_NAME" CHARACTER VARYING(255),
    "LAYOUT" CHARACTER VARYING(255),
    "MATCH_TYPE" CHARACTER VARYING(255),
    "ROBOT_DISABLE_REASON" CHARACTER VARYING(255),
    "SCOUTER_NAME" CHARACTER VARYING(255),
    "STARTING_POSITION" CHARACTER VARYING(255),
    "TIMESTAMP" CHARACTER VARYING(255),
    "AUTO_ALGAE_REMOVED" CHARACTER VARYING(255) ARRAY,
    "AUTO_CORAL_SCORED" CHARACTER VARYING(255) ARRAY
);
ALTER TABLE "PUBLIC"."HTE_ATLAS_ENTRY" ADD CONSTRAINT IF NOT EXISTS "PUBLIC"."CONSTRAINT_AE" PRIMARY KEY("RN_");
-- 0 +/- SELECT COUNT(*) FROM PUBLIC.HTE_ATLAS_ENTRY;
CREATE GLOBAL TEMPORARY TABLE IF NOT EXISTS "PUBLIC"."HTE_BOT_NODES_INFO"(
    "NODEA" BOOLEAN,
    "NODEB" BOOLEAN,
    "NODEC" BOOLEAN,
    "NODED" BOOLEAN,
    "NODEE" BOOLEAN,
    "NODEF" BOOLEAN,
    "NODEG" BOOLEAN,
    "NODEH" BOOLEAN,
    "NODEI" BOOLEAN,
    "NODEJ" BOOLEAN,
    "NODEK" BOOLEAN,
    "NODEL" BOOLEAN,
    "RN_" INTEGER NOT NULL,
    "ID" BIGINT
);
ALTER TABLE "PUBLIC"."HTE_BOT_NODES_INFO" ADD CONSTRAINT IF NOT EXISTS "PUBLIC"."CONSTRAINT_1E" PRIMARY KEY("RN_");
-- 0 +/- SELECT COUNT(*) FROM PUBLIC.HTE_BOT_NODES_INFO;
CREATE GLOBAL TEMPORARY TABLE IF NOT EXISTS "PUBLIC"."HTE_HPENTRY"(
    "BLUE_MISS" INTEGER,
    "BLUE_NET_ALGAE" INTEGER,
    "BLUE_SCORE" INTEGER,
    "BLUEHPTEAM" INTEGER,
    "MATCH_NUMBER" INTEGER,
    "RED_MISS" INTEGER,
    "RED_NET_ALGAE" INTEGER,
    "RED_SCORE" INTEGER,
    "REDHPTEAM" INTEGER,
    "REPLAY" BOOLEAN,
    "RN_" INTEGER NOT NULL,
    "DATA_QUALITY" FLOAT(53),
    "ID" BIGINT,
    "COMMENTS" CHARACTER VARYING(255),
    "EXPORT_NAME" CHARACTER VARYING(255),
    "LAYOUT" CHARACTER VARYING(255),
    "MATCH_TYPE" CHARACTER VARYING(255),
    "SCOUTER_NAME" CHARACTER VARYING(255),
    "TIMESTAMP" CHARACTER VARYING(255)
);
ALTER TABLE "PUBLIC"."HTE_HPENTRY" ADD CONSTRAINT IF NOT EXISTS "PUBLIC"."CONSTRAINT_F8" PRIMARY KEY("RN_");
-- 0 +/- SELECT COUNT(*) FROM PUBLIC.HTE_HPENTRY;
CREATE GLOBAL TEMPORARY TABLE IF NOT EXISTS "PUBLIC"."HTE_CHRONOS_ENTRY"(
    "MATCH_NUMBER" INTEGER,
    "REPLAY" BOOLEAN,
    "RN_" INTEGER NOT NULL,
    "TEAM_NUMBER" INTEGER,
    "DATA_QUALITY" FLOAT(53),
    "ID" BIGINT,
    "RATING" FLOAT(53),
    "COMMENTS" CHARACTER VARYING(255),
    "DRIVER_STATION" CHARACTER VARYING(255),
    "END_LOCATION" CHARACTER VARYING(255),
    "EXPORT_NAME" CHARACTER VARYING(255),
    "GENERAL_STRATEGY" CHARACTER VARYING(255),
    "LAYOUT" CHARACTER VARYING(255),
    "MATCH_TYPE" CHARACTER VARYING(255),
    "SCOUTER_NAME" CHARACTER VARYING(255),
    "STARTING_POSITION" CHARACTER VARYING(255),
    "TIMESTAMP" CHARACTER VARYING(255)
);
ALTER TABLE "PUBLIC"."HTE_CHRONOS_ENTRY" ADD CONSTRAINT IF NOT EXISTS "PUBLIC"."CONSTRAINT_6" PRIMARY KEY("RN_");
-- 0 +/- SELECT COUNT(*) FROM PUBLIC.HTE_CHRONOS_ENTRY;
CREATE GLOBAL TEMPORARY TABLE IF NOT EXISTS "PUBLIC"."HTE_PIT_ENTRY"(
    "AVERAGE_ALGAE_CYCLES" INTEGER,
    "AVERAGE_CORAL_CYCLES" INTEGER,
    "RN_" INTEGER NOT NULL,
    "ROBOT_HEIGHT" INTEGER,
    "ROBOT_LENGTH" INTEGER,
    "ROBOT_WEIGHT" INTEGER,
    "ROBOT_WIDTH" INTEGER,
    "ID" BIGINT,
    "AVERAGE_CLIMB_TIME" CHARACTER VARYING(255),
    "CAN_CLIMB_DEEP" CHARACTER VARYING(255),
    "CAN_CLIMB_SHALLOW" CHARACTER VARYING(255),
    "CAN_INTAKE_GROUND" CHARACTER VARYING(255),
    "CAN_INTAKE_STATION" CHARACTER VARYING(255),
    "CAN_REMOVE_ALGAEL2" CHARACTER VARYING(255),
    "CAN_REMOVE_ALGAEL3" CHARACTER VARYING(255),
    "CAN_SCORE_PROCESSOR" CHARACTER VARYING(255),
    "CAN_SCORENET" CHARACTER VARYING(255),
    "CORAL_SCORING_ABILITYL1" CHARACTER VARYING(255),
    "CORAL_SCORING_ABILITYL2" CHARACTER VARYING(255),
    "CORAL_SCORING_ABILITYL3" CHARACTER VARYING(255),
    "CORAL_SCORING_ABILITYL4" CHARACTER VARYING(255),
    "DRIVE_EXPERIENCE" CHARACTER VARYING(255),
    "EXPORT_NAME" CHARACTER VARYING(255),
    "GENERAL_STRATEGY_PREFERENCE" CHARACTER VARYING(255),
    "HUMAN_PLAYER_PREFERENCE" CHARACTER VARYING(255),
    "IDEAL_ALLIANCE_PARTNER_QUALITIES" CHARACTER VARYING(255),
    "INTERVIEWEE_NAME" CHARACTER VARYING(255),
    "INTERVIEWER_NAME" CHARACTER VARYING(255),
    "LAYOUT" CHARACTER VARYING(255),
    "OTHER_COMMENTS" CHARACTER VARYING(255),
    "ROBOT_DRIVETRAIN" CHARACTER VARYING(255),
    "ROBOT_MECHANISMS" CHARACTER VARYING(255),
    "TEAM_NAME" CHARACTER VARYING(255),
    "TEAM_NUMBER" CHARACTER VARYING(255),
    "TIMESTAMP" CHARACTER VARYING(255)
);
ALTER TABLE "PUBLIC"."HTE_PIT_ENTRY" ADD CONSTRAINT IF NOT EXISTS "PUBLIC"."CONSTRAINT_5" PRIMARY KEY("RN_");
-- 0 +/- SELECT COUNT(*) FROM PUBLIC.HTE_PIT_ENTRY;
CREATE GLOBAL TEMPORARY TABLE IF NOT EXISTS "PUBLIC"."HTE_REEF_INFO"(
    "RN_" INTEGER NOT NULL,
    "TBA_BOT_ROW_COUNT" INTEGER,
    "TBA_MID_ROW_COUNT" INTEGER,
    "TBA_TOP_ROW_COUNT" INTEGER,
    "TROUGH" INTEGER,
    "BOT_ROW_ID" BIGINT,
    "ID" BIGINT,
    "MID_ROW_ID" BIGINT,
    "TOP_ROW_ID" BIGINT
);
ALTER TABLE "PUBLIC"."HTE_REEF_INFO" ADD CONSTRAINT IF NOT EXISTS "PUBLIC"."CONSTRAINT_A0" PRIMARY KEY("RN_");
-- 0 +/- SELECT COUNT(*) FROM PUBLIC.HTE_REEF_INFO;
CREATE GLOBAL TEMPORARY TABLE IF NOT EXISTS "PUBLIC"."HTE_SCORE_BREAKDOWN2025"(
    "RN_" INTEGER NOT NULL,
    "BLUE_ID" BIGINT,
    "ID" BIGINT,
    "RED_ID" BIGINT
);
ALTER TABLE "PUBLIC"."HTE_SCORE_BREAKDOWN2025" ADD CONSTRAINT IF NOT EXISTS "PUBLIC"."CONSTRAINT_B" PRIMARY KEY("RN_");
-- 0 +/- SELECT COUNT(*) FROM PUBLIC.HTE_SCORE_BREAKDOWN2025;
CREATE MEMORY TABLE IF NOT EXISTS "PUBLIC"."ATLAS_ENTRY"(
    "ACCURATE_CLIMB" BOOLEAN NOT NULL,
    "ALGAE_MISS_NET" INTEGER NOT NULL,
    "ALGAE_MISS_PROCESSOR" INTEGER NOT NULL,
    "ALGAE_PICKUPS" INTEGER NOT NULL,
    "ALGAE_REMOVE" INTEGER NOT NULL,
    "ALGAE_SCORE_NET" INTEGER NOT NULL,
    "ALGAE_SCORE_PROCESSOR" INTEGER NOT NULL,
    "ALGAEREMOVEL2" INTEGER NOT NULL,
    "ALGAEREMOVEL3" INTEGER NOT NULL,
    "ATTEMPTED_CLIMB" BOOLEAN NOT NULL,
    "BARGECS" BOOLEAN NOT NULL,
    "CLIMB_START_TIME" INTEGER NOT NULL,
    "CORAL_PICKUPS" INTEGER NOT NULL,
    "CORAL_PICKUPS_GROUND" INTEGER NOT NULL,
    "CORAL_PICKUPS_STATION" INTEGER NOT NULL,
    "CORAL_SCOREDL1" INTEGER NOT NULL,
    "CORAL_SCOREDL2" INTEGER NOT NULL,
    "CORAL_SCOREDL3" INTEGER NOT NULL,
    "CORAL_SCOREDL4" INTEGER NOT NULL,
    "CROSSED_MIDLINE" BOOLEAN NOT NULL,
    "DATA_QUALITY" INTEGER NOT NULL,
    "GROUND_INTAKE" BOOLEAN NOT NULL,
    "HAS_NO_AUTO" BOOLEAN NOT NULL,
    "MATCH_NUMBER" INTEGER NOT NULL,
    "PRELOAD" BOOLEAN NOT NULL,
    "PROCESSORCS" BOOLEAN NOT NULL,
    "REPLAY" BOOLEAN NOT NULL,
    "ROBOT_DISABLED" BOOLEAN NOT NULL,
    "TEAM_NUMBER" INTEGER NOT NULL,
    "ID" BIGINT NOT NULL,
    "AUTO_CORAL_SCOREDL1" CHARACTER VARYING(2047),
    "COMMENTS" CHARACTER VARYING(2047),
    "DEFENSE_RATING" CHARACTER VARYING(2047),
    "DRIVER_STATION" CHARACTER VARYING(2047),
    "END_LOCATION" CHARACTER VARYING(2047),
    "EXPORT_NAME" CHARACTER VARYING(2047),
    "LAYOUT" CHARACTER VARYING(2047),
    "MATCH_TYPE" CHARACTER VARYING(2047),
    "ROBOT_DISABLE_REASON" CHARACTER VARYING(2047),
    "SCOUTER_NAME" CHARACTER VARYING(2047),
    "STARTING_POSITION" CHARACTER VARYING(2047),
    "TIMESTAMP" CHARACTER VARYING(2047),
    "AUTO_ALGAE_REMOVED" CHARACTER VARYING(2047) ARRAY,
    "AUTO_CORAL_SCORED" CHARACTER VARYING(2047) ARRAY
);
ALTER TABLE "PUBLIC"."ATLAS_ENTRY" ADD CONSTRAINT IF NOT EXISTS "PUBLIC"."CONSTRAINT_2" PRIMARY KEY("ID");
-- 0 +/- SELECT COUNT(*) FROM PUBLIC.ATLAS_ENTRY;
CREATE MEMORY TABLE IF NOT EXISTS "PUBLIC"."BLUE_MATCH_ALLIANCE"(
    "SCORE" INTEGER NOT NULL,
    "ID" BIGINT NOT NULL,
    "DQ_TEAM_KEYS" CHARACTER VARYING(2047) ARRAY,
    "SURROGATE_TEAM_KEYS" CHARACTER VARYING(2047) ARRAY,
    "TEAM_KEYS" CHARACTER VARYING(2047) ARRAY
);
ALTER TABLE "PUBLIC"."BLUE_MATCH_ALLIANCE" ADD CONSTRAINT IF NOT EXISTS "PUBLIC"."CONSTRAINT_9F" PRIMARY KEY("ID");
-- 0 +/- SELECT COUNT(*) FROM PUBLIC.BLUE_MATCH_ALLIANCE;
CREATE MEMORY TABLE IF NOT EXISTS "PUBLIC"."BLUE_SCORE_BREAKDOWN_ALLIANCE2025"(
    "ADJUST_POINTS" INTEGER NOT NULL,
    "ALGAE_POINTS" INTEGER NOT NULL,
    "AUTO_BONUS_ACHIEVED" BOOLEAN NOT NULL,
    "AUTO_CORAL_COUNT" INTEGER NOT NULL,
    "AUTO_CORAL_POINTS" INTEGER NOT NULL,
    "AUTO_MOBILITY_POINTS" INTEGER NOT NULL,
    "AUTO_POINTS" INTEGER NOT NULL,
    "BARGE_BONUS_ACHIEVED" BOOLEAN NOT NULL,
    "COOPERTITION_CRITERIA_MET" BOOLEAN NOT NULL,
    "CORAL_BONUS_ACHIEVED" BOOLEAN NOT NULL,
    "END_GAME_BARGE_POINTS" INTEGER NOT NULL,
    "FOUL_COUNT" INTEGER NOT NULL,
    "FOUL_POINTS" INTEGER NOT NULL,
    "G206PENALTY" BOOLEAN NOT NULL,
    "G410PENALTY" BOOLEAN NOT NULL,
    "G418PENALTY" BOOLEAN NOT NULL,
    "G428PENALTY" BOOLEAN NOT NULL,
    "NET_ALGAE_COUNT" INTEGER NOT NULL,
    "RP" INTEGER NOT NULL,
    "TECH_FOUL_COUNT" INTEGER NOT NULL,
    "TELEOP_CORAL_COUNT" INTEGER NOT NULL,
    "TELEOP_CORAL_POINTS" INTEGER NOT NULL,
    "TELEOP_POINTS" INTEGER NOT NULL,
    "TOTAL_POINTS" INTEGER NOT NULL,
    "WALL_ALGAE_COUNT" INTEGER NOT NULL,
    "AUTO_REEF_ID" BIGINT,
    "ID" BIGINT NOT NULL,
    "TELEOP_REEF_ID" BIGINT,
    "AUTO_LINE_ROBOT1" CHARACTER VARYING(2047),
    "AUTO_LINE_ROBOT2" CHARACTER VARYING(2047),
    "AUTO_LINE_ROBOT3" CHARACTER VARYING(2047),
    "END_GAME_ROBOT1" CHARACTER VARYING(2047),
    "END_GAME_ROBOT2" CHARACTER VARYING(2047),
    "END_GAME_ROBOT3" CHARACTER VARYING(2047)
);
ALTER TABLE "PUBLIC"."BLUE_SCORE_BREAKDOWN_ALLIANCE2025" ADD CONSTRAINT IF NOT EXISTS "PUBLIC"."CONSTRAINT_8C9" PRIMARY KEY("ID");
-- 0 +/- SELECT COUNT(*) FROM PUBLIC.BLUE_SCORE_BREAKDOWN_ALLIANCE2025;
CREATE MEMORY TABLE IF NOT EXISTS "PUBLIC"."BOT_NODES_INFO"(
    "NODEA" BOOLEAN NOT NULL,
    "NODEB" BOOLEAN NOT NULL,
    "NODEC" BOOLEAN NOT NULL,
    "NODED" BOOLEAN NOT NULL,
    "NODEE" BOOLEAN NOT NULL,
    "NODEF" BOOLEAN NOT NULL,
    "NODEG" BOOLEAN NOT NULL,
    "NODEH" BOOLEAN NOT NULL,
    "NODEI" BOOLEAN NOT NULL,
    "NODEJ" BOOLEAN NOT NULL,
    "NODEK" BOOLEAN NOT NULL,
    "NODEL" BOOLEAN NOT NULL,
    "ID" BIGINT NOT NULL
);
ALTER TABLE "PUBLIC"."BOT_NODES_INFO" ADD CONSTRAINT IF NOT EXISTS "PUBLIC"."CONSTRAINT_3" PRIMARY KEY("ID");
-- 0 +/- SELECT COUNT(*) FROM PUBLIC.BOT_NODES_INFO;

CREATE MEMORY TABLE IF NOT EXISTS "PUBLIC"."CHRONOS_ENTRY"(
    "DATA_QUALITY" FLOAT(53) NOT NULL,
    "MATCH_NUMBER" INTEGER NOT NULL,
    "RATING" FLOAT(53) NOT NULL,
    "REPLAY" BOOLEAN NOT NULL,
    "TEAM_NUMBER" INTEGER NOT NULL,
    "ID" BIGINT NOT NULL,
    "COMMENTS" CHARACTER VARYING(2047),
    "DRIVER_STATION" CHARACTER VARYING(2047),
    "END_LOCATION" CHARACTER VARYING(2047),
    "EXPORT_NAME" CHARACTER VARYING(2047),
    "GENERAL_STRATEGY" CHARACTER VARYING(2047),
    "LAYOUT" CHARACTER VARYING(2047),
    "MATCH_TYPE" CHARACTER VARYING(2047),
    "SCOUTER_NAME" CHARACTER VARYING(2047),
    "STARTING_POSITION" CHARACTER VARYING(2047),
    "TIMESTAMP" CHARACTER VARYING(2047)
);
ALTER TABLE "PUBLIC"."CHRONOS_ENTRY" ADD CONSTRAINT IF NOT EXISTS "PUBLIC"."CONSTRAINT_B2" PRIMARY KEY("ID");
-- 0 +/- SELECT COUNT(*) FROM PUBLIC.CHRONOS_ENTRY;
CREATE MEMORY TABLE IF NOT EXISTS "PUBLIC"."CHRONOS_ENTRY_AUTO_EVENT_LIST"(
    "DOUBLEE" FLOAT(53),
    "CHRONOS_ENTRY_ID" BIGINT NOT NULL,
    "STR" CHARACTER VARYING(2047)
);
-- 0 +/- SELECT COUNT(*) FROM PUBLIC.CHRONOS_ENTRY_AUTO_EVENT_LIST;
CREATE MEMORY TABLE IF NOT EXISTS "PUBLIC"."CHRONOS_ENTRY_TELEOP_EVENT_LIST"(
    "DOUBLEE" FLOAT(53),
    "CHRONOS_ENTRY_ID" BIGINT NOT NULL,
    "STR" CHARACTER VARYING(2047)
);
-- 0 +/- SELECT COUNT(*) FROM PUBLIC.CHRONOS_ENTRY_TELEOP_EVENT_LIST;
CREATE MEMORY TABLE IF NOT EXISTS "PUBLIC"."DATA_FLAG_ENTRY"(
    "MATCH_NUMBER" INTEGER NOT NULL,
    "REPLAY" BOOLEAN NOT NULL,
    "ID" BIGINT NOT NULL,
    "DRIVER_STATION" CHARACTER VARYING(2047),
    "FLAG" CHARACTER VARYING(2047),
    "FLAG_TYPE" CHARACTER VARYING(2047),
    "LAYOUT" CHARACTER VARYING(2047),
    "MATCH_TYPE" CHARACTER VARYING(2047)
);
ALTER TABLE "PUBLIC"."DATA_FLAG_ENTRY" ADD CONSTRAINT IF NOT EXISTS "PUBLIC"."CONSTRAINT_32" PRIMARY KEY("ID");
-- 0 +/- SELECT COUNT(*) FROM PUBLIC.DATA_FLAG_ENTRY;
CREATE MEMORY TABLE IF NOT EXISTS "PUBLIC"."HPENTRY"(
    "BLUE_MISS" INTEGER NOT NULL,
    "BLUE_NET_ALGAE" INTEGER NOT NULL,
    "BLUE_SCORE" INTEGER NOT NULL,
    "BLUEHPTEAM" INTEGER NOT NULL,
    "DATA_QUALITY" FLOAT(53) NOT NULL,
    "MATCH_NUMBER" INTEGER NOT NULL,
    "RED_MISS" INTEGER NOT NULL,
    "RED_NET_ALGAE" INTEGER NOT NULL,
    "RED_SCORE" INTEGER NOT NULL,
    "REDHPTEAM" INTEGER NOT NULL,
    "REPLAY" BOOLEAN NOT NULL,
    "ID" BIGINT NOT NULL,
    "COMMENTS" CHARACTER VARYING(2047),
    "EXPORT_NAME" CHARACTER VARYING(2047),
    "LAYOUT" CHARACTER VARYING(2047),
    "MATCH_TYPE" CHARACTER VARYING(2047),
    "SCOUTER_NAME" CHARACTER VARYING(2047),
    "TIMESTAMP" CHARACTER VARYING(2047)
);
ALTER TABLE "PUBLIC"."HPENTRY" ADD CONSTRAINT IF NOT EXISTS "PUBLIC"."CONSTRAINT_6D" PRIMARY KEY("ID");
-- 0 +/- SELECT COUNT(*) FROM PUBLIC.HPENTRY;
CREATE MEMORY TABLE IF NOT EXISTS "PUBLIC"."MATCH_ALLIANCES"(
    "BLUE_ID" BIGINT,
    "ID" BIGINT NOT NULL,
    "RED_ID" BIGINT
);
ALTER TABLE "PUBLIC"."MATCH_ALLIANCES" ADD CONSTRAINT IF NOT EXISTS "PUBLIC"."CONSTRAINT_DF3" PRIMARY KEY("ID");
-- 0 +/- SELECT COUNT(*) FROM PUBLIC.MATCH_ALLIANCES;

CREATE MEMORY TABLE IF NOT EXISTS "PUBLIC"."MATCH_ENTRY"(
    "MATCH_NUMBER" INTEGER NOT NULL,
    "SET_NUMBER" INTEGER NOT NULL,
    "ACTUAL_TIME" BIGINT NOT NULL,
    "ALLIANCES_ID" BIGINT,
    "POST_RESULT_TIME" BIGINT NOT NULL,
    "PREDICTED_TIME" BIGINT NOT NULL,
    "SCORE_BREAKDOWN_ID" BIGINT,
    "TIME" BIGINT NOT NULL,
    "COMP_LEVEL" CHARACTER VARYING(2047),
    "EVENT_KEY" CHARACTER VARYING(2047),
    "KEYY" CHARACTER VARYING(2047) NOT NULL,
    "WINNING_ALLIANCE" CHARACTER VARYING(2047)
);
ALTER TABLE "PUBLIC"."MATCH_ENTRY" ADD CONSTRAINT IF NOT EXISTS "PUBLIC"."CONSTRAINT_2CA0" PRIMARY KEY("KEYY");
-- 0 +/- SELECT COUNT(*) FROM PUBLIC.MATCH_ENTRY;

CREATE MEMORY TABLE IF NOT EXISTS "PUBLIC"."MATCH_ENTRY_VIDEOS"(
    "VIDEOS_ORDER" INTEGER NOT NULL,
    "KEYY" CHARACTER VARYING(2047),
    "MATCH_ENTRY_KEYY" CHARACTER VARYING(2047) NOT NULL,
    "TYPE" CHARACTER VARYING(2047)
);
ALTER TABLE "PUBLIC"."MATCH_ENTRY_VIDEOS" ADD CONSTRAINT IF NOT EXISTS "PUBLIC"."CONSTRAINT_98" PRIMARY KEY("VIDEOS_ORDER", "MATCH_ENTRY_KEYY");
-- 0 +/- SELECT COUNT(*) FROM PUBLIC.MATCH_ENTRY_VIDEOS;

CREATE MEMORY TABLE IF NOT EXISTS "PUBLIC"."MID_NODES_INFO"(
    "NODEA" BOOLEAN NOT NULL,
    "NODEB" BOOLEAN NOT NULL,
    "NODEC" BOOLEAN NOT NULL,
    "NODED" BOOLEAN NOT NULL,
    "NODEE" BOOLEAN NOT NULL,
    "NODEF" BOOLEAN NOT NULL,
    "NODEG" BOOLEAN NOT NULL,
    "NODEH" BOOLEAN NOT NULL,
    "NODEI" BOOLEAN NOT NULL,
    "NODEJ" BOOLEAN NOT NULL,
    "NODEK" BOOLEAN NOT NULL,
    "NODEL" BOOLEAN NOT NULL,
    "ID" BIGINT NOT NULL
);
ALTER TABLE "PUBLIC"."MID_NODES_INFO" ADD CONSTRAINT IF NOT EXISTS "PUBLIC"."CONSTRAINT_DB" PRIMARY KEY("ID");
-- 0 +/- SELECT COUNT(*) FROM PUBLIC.MID_NODES_INFO;

CREATE MEMORY TABLE IF NOT EXISTS "PUBLIC"."PATCH_ENTRY"(
    "MATCH_NUMBER" INTEGER NOT NULL,
    "REPLAY" BOOLEAN NOT NULL,
    "TEAM_NUMBER" INTEGER NOT NULL,
    "ID" BIGINT NOT NULL,
    "COMMENTS" CHARACTER VARYING(2047),
    "DATA_TYPE" CHARACTER VARYING(2047),
    "DRIVER_STATION" CHARACTER VARYING(2047),
    "MATCH_TYPE" CHARACTER VARYING(2047),
    "PATCHER" CHARACTER VARYING(2047)
);
ALTER TABLE "PUBLIC"."PATCH_ENTRY" ADD CONSTRAINT IF NOT EXISTS "PUBLIC"."CONSTRAINT_EB" PRIMARY KEY("ID");
-- 0 +/- SELECT COUNT(*) FROM PUBLIC.PATCH_ENTRY;
CREATE MEMORY TABLE IF NOT EXISTS "PUBLIC"."PIT_ENTRY"(
    "AVERAGE_ALGAE_CYCLES" INTEGER NOT NULL,
    "AVERAGE_CORAL_CYCLES" INTEGER NOT NULL,
    "ROBOT_HEIGHT" INTEGER NOT NULL,
    "ROBOT_LENGTH" INTEGER NOT NULL,
    "ROBOT_WEIGHT" INTEGER NOT NULL,
    "ROBOT_WIDTH" INTEGER NOT NULL,
    "ID" BIGINT NOT NULL,
    "AVERAGE_CLIMB_TIME" CHARACTER VARYING(2047),
    "CAN_CLIMB_DEEP" CHARACTER VARYING(2047),
    "CAN_CLIMB_SHALLOW" CHARACTER VARYING(2047),
    "CAN_INTAKE_GROUND" CHARACTER VARYING(2047),
    "CAN_INTAKE_STATION" CHARACTER VARYING(2047),
    "CAN_REMOVE_ALGAEL2" CHARACTER VARYING(2047),
    "CAN_REMOVE_ALGAEL3" CHARACTER VARYING(2047),
    "CAN_SCORE_PROCESSOR" CHARACTER VARYING(2047),
    "CAN_SCORENET" CHARACTER VARYING(2047),
    "CORAL_SCORING_ABILITYL1" CHARACTER VARYING(2047),
    "CORAL_SCORING_ABILITYL2" CHARACTER VARYING(2047),
    "CORAL_SCORING_ABILITYL3" CHARACTER VARYING(2047),
    "CORAL_SCORING_ABILITYL4" CHARACTER VARYING(2047),
    "DRIVE_EXPERIENCE" CHARACTER VARYING(2047),
    "EXPORT_NAME" CHARACTER VARYING(2047),
    "GENERAL_STRATEGY_PREFERENCE" CHARACTER VARYING(2047),
    "HUMAN_PLAYER_PREFERENCE" CHARACTER VARYING(2047),
    "IDEAL_ALLIANCE_PARTNER_QUALITIES" CHARACTER VARYING(2047),
    "INTERVIEWEE_NAME" CHARACTER VARYING(2047),
    "INTERVIEWER_NAME" CHARACTER VARYING(2047),
    "LAYOUT" CHARACTER VARYING(2047),
    "OTHER_COMMENTS" CHARACTER VARYING(2047),
    "ROBOT_DRIVETRAIN" CHARACTER VARYING(2047),
    "ROBOT_MECHANISMS" CHARACTER VARYING(2047),
    "TEAM_NAME" CHARACTER VARYING(2047),
    "TEAM_NUMBER" CHARACTER VARYING(2047),
    "TIMESTAMP" CHARACTER VARYING(2047)
);
ALTER TABLE "PUBLIC"."PIT_ENTRY" ADD CONSTRAINT IF NOT EXISTS "PUBLIC"."CONSTRAINT_F6" PRIMARY KEY("ID");
-- 0 +/- SELECT COUNT(*) FROM PUBLIC.PIT_ENTRY;

CREATE MEMORY TABLE IF NOT EXISTS "PUBLIC"."PIT_ENTRY_AUTO"(
    "AUTO_ORDER" INTEGER NOT NULL,
    "BARGECS" BOOLEAN,
    "DRIVES_OUT" BOOLEAN,
    "DROPS_ALGAE_AUTO" BOOLEAN,
    "GROUND_INTAKE" BOOLEAN,
    "HAS_NO_AUTO" BOOLEAN,
    "PROCESSORCS" BOOLEAN,
    "PIT_ENTRY_ID" BIGINT NOT NULL,
    "AUTO_CORAL_SCOREDL1" CHARACTER VARYING(2047),
    "AUTO_ALGAE_REMOVED" CHARACTER VARYING(2047) ARRAY,
    "AUTO_CORAL_SCORED" CHARACTER VARYING(2047) ARRAY
);
ALTER TABLE "PUBLIC"."PIT_ENTRY_AUTO" ADD CONSTRAINT IF NOT EXISTS "PUBLIC"."CONSTRAINT_95" PRIMARY KEY("AUTO_ORDER", "PIT_ENTRY_ID");
-- 0 +/- SELECT COUNT(*) FROM PUBLIC.PIT_ENTRY_AUTO;

CREATE MEMORY TABLE IF NOT EXISTS "PUBLIC"."RED_MATCH_ALLIANCE"(
    "SCORE" INTEGER NOT NULL,
    "ID" BIGINT NOT NULL,
    "DQ_TEAM_KEYS" CHARACTER VARYING(2047) ARRAY,
    "SURROGATE_TEAM_KEYS" CHARACTER VARYING(2047) ARRAY,
    "TEAM_KEYS" CHARACTER VARYING(2047) ARRAY
);
ALTER TABLE "PUBLIC"."RED_MATCH_ALLIANCE" ADD CONSTRAINT IF NOT EXISTS "PUBLIC"."CONSTRAINT_4" PRIMARY KEY("ID");
-- 0 +/- SELECT COUNT(*) FROM PUBLIC.RED_MATCH_ALLIANCE;

CREATE MEMORY TABLE IF NOT EXISTS "PUBLIC"."RED_SCORE_BREAKDOWN_ALLIANCE2025"(
    "ADJUST_POINTS" INTEGER NOT NULL,
    "ALGAE_POINTS" INTEGER NOT NULL,
    "AUTO_BONUS_ACHIEVED" BOOLEAN NOT NULL,
    "AUTO_CORAL_COUNT" INTEGER NOT NULL,
    "AUTO_CORAL_POINTS" INTEGER NOT NULL,
    "AUTO_MOBILITY_POINTS" INTEGER NOT NULL,
    "AUTO_POINTS" INTEGER NOT NULL,
    "BARGE_BONUS_ACHIEVED" BOOLEAN NOT NULL,
    "COOPERTITION_CRITERIA_MET" BOOLEAN NOT NULL,
    "CORAL_BONUS_ACHIEVED" BOOLEAN NOT NULL,
    "END_GAME_BARGE_POINTS" INTEGER NOT NULL,
    "FOUL_COUNT" INTEGER NOT NULL,
    "FOUL_POINTS" INTEGER NOT NULL,
    "G206PENALTY" BOOLEAN NOT NULL,
    "G410PENALTY" BOOLEAN NOT NULL,
    "G418PENALTY" BOOLEAN NOT NULL,
    "G428PENALTY" BOOLEAN NOT NULL,
    "NET_ALGAE_COUNT" INTEGER NOT NULL,
    "RP" INTEGER NOT NULL,
    "TECH_FOUL_COUNT" INTEGER NOT NULL,
    "TELEOP_CORAL_COUNT" INTEGER NOT NULL,
    "TELEOP_CORAL_POINTS" INTEGER NOT NULL,
    "TELEOP_POINTS" INTEGER NOT NULL,
    "TOTAL_POINTS" INTEGER NOT NULL,
    "WALL_ALGAE_COUNT" INTEGER NOT NULL,
    "AUTO_REEF_ID" BIGINT,
    "ID" BIGINT NOT NULL,
    "TELEOP_REEF_ID" BIGINT,
    "AUTO_LINE_ROBOT1" CHARACTER VARYING(2047),
    "AUTO_LINE_ROBOT2" CHARACTER VARYING(2047),
    "AUTO_LINE_ROBOT3" CHARACTER VARYING(2047),
    "END_GAME_ROBOT1" CHARACTER VARYING(2047),
    "END_GAME_ROBOT2" CHARACTER VARYING(2047),
    "END_GAME_ROBOT3" CHARACTER VARYING(2047)
);
ALTER TABLE "PUBLIC"."RED_SCORE_BREAKDOWN_ALLIANCE2025" ADD CONSTRAINT IF NOT EXISTS "PUBLIC"."CONSTRAINT_FCE98" PRIMARY KEY("ID");
-- 0 +/- SELECT COUNT(*) FROM PUBLIC.RED_SCORE_BREAKDOWN_ALLIANCE2025;
CREATE MEMORY TABLE IF NOT EXISTS "PUBLIC"."REEF_INFO"(
    "TBA_BOT_ROW_COUNT" INTEGER NOT NULL,
    "TBA_MID_ROW_COUNT" INTEGER NOT NULL,
    "TBA_TOP_ROW_COUNT" INTEGER NOT NULL,
    "TROUGH" INTEGER NOT NULL,
    "BOT_ROW_ID" BIGINT,
    "ID" BIGINT NOT NULL,
    "MID_ROW_ID" BIGINT,
    "TOP_ROW_ID" BIGINT
);
ALTER TABLE "PUBLIC"."REEF_INFO" ADD CONSTRAINT IF NOT EXISTS "PUBLIC"."CONSTRAINT_3C7AE" PRIMARY KEY("ID");
-- 0 +/- SELECT COUNT(*) FROM PUBLIC.REEF_INFO;

CREATE MEMORY TABLE IF NOT EXISTS "PUBLIC"."SCORE_BREAKDOWN2025"(
    "BLUE_ID" BIGINT,
    "ID" BIGINT NOT NULL,
    "RED_ID" BIGINT
);
ALTER TABLE "PUBLIC"."SCORE_BREAKDOWN2025" ADD CONSTRAINT IF NOT EXISTS "PUBLIC"."CONSTRAINT_5FBB" PRIMARY KEY("ID");
-- 0 +/- SELECT COUNT(*) FROM PUBLIC.SCORE_BREAKDOWN2025;

CREATE MEMORY TABLE IF NOT EXISTS "PUBLIC"."TOP_NODES_INFO"(
    "NODEA" BOOLEAN NOT NULL,
    "NODEB" BOOLEAN NOT NULL,
    "NODEC" BOOLEAN NOT NULL,
    "NODED" BOOLEAN NOT NULL,
    "NODEE" BOOLEAN NOT NULL,
    "NODEF" BOOLEAN NOT NULL,
    "NODEG" BOOLEAN NOT NULL,
    "NODEH" BOOLEAN NOT NULL,
    "NODEI" BOOLEAN NOT NULL,
    "NODEJ" BOOLEAN NOT NULL,
    "NODEK" BOOLEAN NOT NULL,
    "NODEL" BOOLEAN NOT NULL,
    "ID" BIGINT NOT NULL
);
ALTER TABLE "PUBLIC"."TOP_NODES_INFO" ADD CONSTRAINT IF NOT EXISTS "PUBLIC"."CONSTRAINT_FB" PRIMARY KEY("ID");
-- 0 +/- SELECT COUNT(*) FROM PUBLIC.TOP_NODES_INFO;


CREATE MEMORY TABLE IF NOT EXISTS "PUBLIC"."VERIF_CODE"(
    "COMMENT" CHARACTER VARYING(2047),
    "PASSWORD" CHARACTER VARYING(2047) NOT NULL
);
ALTER TABLE "PUBLIC"."VERIF_CODE" ADD CONSTRAINT IF NOT EXISTS "PUBLIC"."CONSTRAINT_DFB" PRIMARY KEY("PASSWORD");
-- 0 +/- SELECT COUNT(*) FROM PUBLIC.VERIF_CODE;

ALTER TABLE "PUBLIC"."BLUE_SCORE_BREAKDOWN_ALLIANCE2025" ADD CONSTRAINT IF NOT EXISTS "PUBLIC"."CONSTRAINT_8C" UNIQUE NULLS DISTINCT ("TELEOP_REEF_ID");
ALTER TABLE "PUBLIC"."MATCH_ALLIANCES" ADD CONSTRAINT IF NOT EXISTS "PUBLIC"."CONSTRAINT_DF" UNIQUE NULLS DISTINCT ("RED_ID");
ALTER TABLE "PUBLIC"."BLUE_SCORE_BREAKDOWN_ALLIANCE2025" ADD CONSTRAINT IF NOT EXISTS "PUBLIC"."CONSTRAINT_8" UNIQUE NULLS DISTINCT ("AUTO_REEF_ID");
ALTER TABLE "PUBLIC"."REEF_INFO" ADD CONSTRAINT IF NOT EXISTS "PUBLIC"."CONSTRAINT_3C7" UNIQUE NULLS DISTINCT ("MID_ROW_ID");
ALTER TABLE "PUBLIC"."REEF_INFO" ADD CONSTRAINT IF NOT EXISTS "PUBLIC"."CONSTRAINT_3C7A" UNIQUE NULLS DISTINCT ("TOP_ROW_ID");
ALTER TABLE "PUBLIC"."SCORE_BREAKDOWN2025" ADD CONSTRAINT IF NOT EXISTS "PUBLIC"."CONSTRAINT_5FB" UNIQUE NULLS DISTINCT ("RED_ID");
ALTER TABLE "PUBLIC"."RED_SCORE_BREAKDOWN_ALLIANCE2025" ADD CONSTRAINT IF NOT EXISTS "PUBLIC"."CONSTRAINT_FCE" UNIQUE NULLS DISTINCT ("AUTO_REEF_ID");
ALTER TABLE "PUBLIC"."MATCH_ALLIANCES" ADD CONSTRAINT IF NOT EXISTS "PUBLIC"."CONSTRAINT_D" UNIQUE NULLS DISTINCT ("BLUE_ID");
ALTER TABLE "PUBLIC"."REEF_INFO" ADD CONSTRAINT IF NOT EXISTS "PUBLIC"."CONSTRAINT_3C" UNIQUE NULLS DISTINCT ("BOT_ROW_ID");
ALTER TABLE "PUBLIC"."HPENTRY" ADD CONSTRAINT IF NOT EXISTS "PUBLIC"."CONSTRAINT_6D3" UNIQUE NULLS DISTINCT ("MATCH_TYPE", "REPLAY", "MATCH_NUMBER", "SCOUTER_NAME");
ALTER TABLE "PUBLIC"."ATLAS_ENTRY" ADD CONSTRAINT IF NOT EXISTS "PUBLIC"."CONSTRAINT_27" UNIQUE NULLS DISTINCT ("SCOUTER_NAME", "TEAM_NUMBER", "DRIVER_STATION", "MATCH_TYPE", "MATCH_NUMBER", "REPLAY");
ALTER TABLE "PUBLIC"."MATCH_ENTRY" ADD CONSTRAINT IF NOT EXISTS "PUBLIC"."CONSTRAINT_2CA" UNIQUE NULLS DISTINCT ("SCORE_BREAKDOWN_ID");
ALTER TABLE "PUBLIC"."RED_SCORE_BREAKDOWN_ALLIANCE2025" ADD CONSTRAINT IF NOT EXISTS "PUBLIC"."CONSTRAINT_FCE9" UNIQUE NULLS DISTINCT ("TELEOP_REEF_ID");
ALTER TABLE "PUBLIC"."MATCH_ENTRY" ADD CONSTRAINT IF NOT EXISTS "PUBLIC"."CONSTRAINT_2C" UNIQUE NULLS DISTINCT ("ALLIANCES_ID");
ALTER TABLE "PUBLIC"."PIT_ENTRY" ADD CONSTRAINT IF NOT EXISTS "PUBLIC"."CONSTRAINT_F63" UNIQUE NULLS DISTINCT ("TEAM_NAME", "INTERVIEWER_NAME", "INTERVIEWEE_NAME");
ALTER TABLE "PUBLIC"."CHRONOS_ENTRY" ADD CONSTRAINT IF NOT EXISTS "PUBLIC"."CONSTRAINT_B23" UNIQUE NULLS DISTINCT ("SCOUTER_NAME", "MATCH_TYPE", "MATCH_NUMBER", "REPLAY", "DRIVER_STATION", "TEAM_NUMBER");
ALTER TABLE "PUBLIC"."SCORE_BREAKDOWN2025" ADD CONSTRAINT IF NOT EXISTS "PUBLIC"."CONSTRAINT_5F" UNIQUE NULLS DISTINCT ("BLUE_ID");
ALTER TABLE "PUBLIC"."RED_SCORE_BREAKDOWN_ALLIANCE2025" ADD CONSTRAINT IF NOT EXISTS "PUBLIC"."FKNWDLE34NIUV8PHJ7AW5F7KU5X" FOREIGN KEY("TELEOP_REEF_ID") REFERENCES "PUBLIC"."REEF_INFO"("ID") NOCHECK;
ALTER TABLE "PUBLIC"."SCORE_BREAKDOWN2025" ADD CONSTRAINT IF NOT EXISTS "PUBLIC"."FKGXEA29GSE13JABQC4M19EAWQL" FOREIGN KEY("BLUE_ID") REFERENCES "PUBLIC"."BLUE_SCORE_BREAKDOWN_ALLIANCE2025"("ID") NOCHECK;
ALTER TABLE "PUBLIC"."PIT_ENTRY_AUTO" ADD CONSTRAINT IF NOT EXISTS "PUBLIC"."FKH8587XEJBS2QSVUK8F9YHHVI0" FOREIGN KEY("PIT_ENTRY_ID") REFERENCES "PUBLIC"."PIT_ENTRY"("ID") NOCHECK;
ALTER TABLE "PUBLIC"."CHRONOS_ENTRY_AUTO_EVENT_LIST" ADD CONSTRAINT IF NOT EXISTS "PUBLIC"."FK3GF1NAR43PC4RRCME70O3Y09B" FOREIGN KEY("CHRONOS_ENTRY_ID") REFERENCES "PUBLIC"."CHRONOS_ENTRY"("ID") NOCHECK;
ALTER TABLE "PUBLIC"."MATCH_ENTRY" ADD CONSTRAINT IF NOT EXISTS "PUBLIC"."FKQ9NEVDDC59SFGS5J7FJJJBIYT" FOREIGN KEY("SCORE_BREAKDOWN_ID") REFERENCES "PUBLIC"."SCORE_BREAKDOWN2025"("ID") NOCHECK;
ALTER TABLE "PUBLIC"."SCORE_BREAKDOWN2025" ADD CONSTRAINT IF NOT EXISTS "PUBLIC"."FKD76JJSKKFJW4HY736XH17YVUV" FOREIGN KEY("RED_ID") REFERENCES "PUBLIC"."RED_SCORE_BREAKDOWN_ALLIANCE2025"("ID") NOCHECK;
ALTER TABLE "PUBLIC"."MATCH_ALLIANCES" ADD CONSTRAINT IF NOT EXISTS "PUBLIC"."FK2O09M607LTBJA7NSYCNU5830C" FOREIGN KEY("RED_ID") REFERENCES "PUBLIC"."RED_MATCH_ALLIANCE"("ID") NOCHECK;
ALTER TABLE "PUBLIC"."MATCH_ALLIANCES" ADD CONSTRAINT IF NOT EXISTS "PUBLIC"."FKC0TLA5AN7D2HAUXIYNUCVSLPL" FOREIGN KEY("BLUE_ID") REFERENCES "PUBLIC"."BLUE_MATCH_ALLIANCE"("ID") NOCHECK;
ALTER TABLE "PUBLIC"."REEF_INFO" ADD CONSTRAINT IF NOT EXISTS "PUBLIC"."FKATVKQU9EDWOVJ8QABR1FBYVEQ" FOREIGN KEY("MID_ROW_ID") REFERENCES "PUBLIC"."MID_NODES_INFO"("ID") NOCHECK;
ALTER TABLE "PUBLIC"."MATCH_ENTRY_VIDEOS" ADD CONSTRAINT IF NOT EXISTS "PUBLIC"."FKN5VRLLJ6Y5WCJCIQECU63KU60" FOREIGN KEY("MATCH_ENTRY_KEYY") REFERENCES "PUBLIC"."MATCH_ENTRY"("KEYY") NOCHECK;
ALTER TABLE "PUBLIC"."REEF_INFO" ADD CONSTRAINT IF NOT EXISTS "PUBLIC"."FK7H7RC9PU5GYIQPDP3VV97OQDI" FOREIGN KEY("TOP_ROW_ID") REFERENCES "PUBLIC"."TOP_NODES_INFO"("ID") NOCHECK;
ALTER TABLE "PUBLIC"."BLUE_SCORE_BREAKDOWN_ALLIANCE2025" ADD CONSTRAINT IF NOT EXISTS "PUBLIC"."FK6QONN2PI95DS43IXAY0CGTDKM" FOREIGN KEY("AUTO_REEF_ID") REFERENCES "PUBLIC"."REEF_INFO"("ID") NOCHECK;
ALTER TABLE "PUBLIC"."MATCH_ENTRY" ADD CONSTRAINT IF NOT EXISTS "PUBLIC"."FK7HRIB1S50OHPV5WCNCVX8BEHM" FOREIGN KEY("ALLIANCES_ID") REFERENCES "PUBLIC"."MATCH_ALLIANCES"("ID") NOCHECK;
ALTER TABLE "PUBLIC"."BLUE_SCORE_BREAKDOWN_ALLIANCE2025" ADD CONSTRAINT IF NOT EXISTS "PUBLIC"."FKSIEH9YFG1T7T57CJI6Y3IM6X7" FOREIGN KEY("TELEOP_REEF_ID") REFERENCES "PUBLIC"."REEF_INFO"("ID") NOCHECK;
ALTER TABLE "PUBLIC"."CHRONOS_ENTRY_TELEOP_EVENT_LIST" ADD CONSTRAINT IF NOT EXISTS "PUBLIC"."FKNDAYHH22UGY2COW8IERO6769A" FOREIGN KEY("CHRONOS_ENTRY_ID") REFERENCES "PUBLIC"."CHRONOS_ENTRY"("ID") NOCHECK;
ALTER TABLE "PUBLIC"."REEF_INFO" ADD CONSTRAINT IF NOT EXISTS "PUBLIC"."FKLAQ59RQ6JNPUMTSUFY29195E8" FOREIGN KEY("BOT_ROW_ID") REFERENCES "PUBLIC"."BOT_NODES_INFO"("ID") NOCHECK;
ALTER TABLE "PUBLIC"."RED_SCORE_BREAKDOWN_ALLIANCE2025" ADD CONSTRAINT IF NOT EXISTS "PUBLIC"."FKOSS3VYBWH0DMTWNMWSH4NVRKC" FOREIGN KEY("AUTO_REEF_ID") REFERENCES "PUBLIC"."REEF_INFO"("ID") NOCHECK;
