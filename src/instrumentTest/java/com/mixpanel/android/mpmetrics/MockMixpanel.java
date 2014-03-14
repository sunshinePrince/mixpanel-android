package com.mixpanel.android.mpmetrics;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;

import junit.framework.Assert;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;

class MockMixpanel extends MixpanelAPI {
    public MockMixpanel(Context context, Future<SharedPreferences> prefsFuture, String testToken) {
        super(context, prefsFuture, testToken);
    }

    // Not complete- you may need to override track(), registerSuperProperties, etc
    // as you use this class more.

    @Override
    public People getPeople() {
        return new MockPeople();
    }

    public static class MockPeople implements People {
        @Override
        public void checkForSurvey(final SurveyCallbacks callbacks, final Activity parent) {
            Assert.fail("Unexpected call");
        }

        @Override
        public void showSurvey(final Survey s, final Activity parent) {
            Assert.fail("Unexpected call");
        }

        @Override
        public void showNotification(final InAppNotification notification, final Activity parent) {
            Assert.fail("Unexpected call");
        }

        @Override
        public void identify(final String distinctId) {
            Assert.fail("Unexpected call");
        }

        @Override
        public void set(final String propertyName, final Object value) {
            Assert.fail("Unexpected call");
        }

        @Override
        public void set(final JSONObject properties) {
            Assert.fail("Unexpected call");
        }

        @Override
        public void setOnce(final String propertyName, final Object value) {
            Assert.fail("Unexpected call");
        }

        @Override
        public void setOnce(final JSONObject properties) {
            Assert.fail("Unexpected call");
        }

        @Override
        public void increment(final String name, final double increment) {
            Assert.fail("Unexpected call");
        }

        @Override
        public void increment(final Map<String, ? extends Number> properties) {
            Assert.fail("Unexpected call");
        }

        @Override
        public void append(final String name, final Object value) {
            Assert.fail("Unexpected call");
        }

        @Override
        public void union(final String name, final JSONArray value) {
            Assert.fail("Unexpected call");
        }

        @Override
        public void unset(final String name) {
            Assert.fail("Unexpected call");
        }

        @Override
        public void trackCharge(final double amount, final JSONObject properties) {
            Assert.fail("Unexpected call");
        }

        @Override
        public void clearCharges() {
            Assert.fail("Unexpected call");
        }

        @Override
        public void deleteUser() {
            Assert.fail("Unexpected call");
        }

        @Override
        public void initPushHandling(final String senderID) {
            Assert.fail("Unexpected call");
        }

        @Override
        public void setPushRegistrationId(final String registrationId) {
            Assert.fail("Unexpected call");
        }

        @Override
        public void clearPushRegistrationId() {
            Assert.fail("Unexpected call");
        }

        @Override
        public String getDistinctId() {
            Assert.fail("Unexpected call");
            return null;
        }

        @Override
        public Survey getNextSurvey() {
            Assert.fail("Unexpected call");
            return null;
        }

        @Override
        public InAppNotification getNextInAppNotification() {
            Assert.fail("Unexpected call");
            return null;
        }

        @Override
        public void checkForSurvey(final SurveyCallbacks callbacks) {
            Assert.fail("Unexpected call");
        }

        @Override
        public void addOnMixpanelUpdatesReceivedListener(final OnMixpanelUpdatesReceivedListener listener) {
            Assert.fail("Unexpected call");
        }

        @Override
        public void removeOnMixpanelUpdatesReceivedListener(final OnMixpanelUpdatesReceivedListener listener) {
            Assert.fail("Unexpected call");
        }

        @Override
        public People withIdentity(final String distinctId) {
            Assert.fail("Unexpected call");
            return null;
        }
    };


}
