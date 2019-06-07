package org.wikipedia.edit;

import androidx.annotation.Nullable;

import org.wikipedia.dataclient.mwapi.MwPostResponse;

public class Edit extends MwPostResponse {
    @SuppressWarnings("unused,") @Nullable private Result edit;

    public @Nullable Result edit() {
        return edit;
    }

    boolean hasEditResult() {
        return edit != null;
    }

    public class Result {
        @SuppressWarnings("unused") @Nullable private String result;
        @SuppressWarnings("unused") private int newrevid;
        @SuppressWarnings("unused") @Nullable private Captcha captcha;
        @SuppressWarnings("unused") @Nullable private String code;
        @SuppressWarnings("unused") @Nullable private String info;
        @SuppressWarnings("unused") @Nullable private String warning;
        @SuppressWarnings("unused") @Nullable private String spamblacklist;

        @Nullable String status() {
            return result;
        }

        public int newRevId() {
            return newrevid;
        }

        public boolean editSucceeded() {
            return "Success".equals(result);
        }

        @Nullable String captchaId() {
            return captcha == null ? null : captcha.id();
        }

        public boolean hasEditErrorCode() {
            return code != null;
        }

        boolean hasCaptchaResponse() {
            return captcha != null;
        }

        public @Nullable String code() {
            return code;
        }

        public @Nullable String info() {
            return info;
        }

        public @Nullable String warning() {
            return warning;
        }

        @Nullable String spamblacklist() {
            return spamblacklist;
        }

        boolean hasSpamBlacklistResponse() {
            return spamblacklist != null;
        }
    }

    private static class Captcha {
        @SuppressWarnings("unused") @Nullable private String id;

        @Nullable String id() {
            return id;
        }
    }
}
