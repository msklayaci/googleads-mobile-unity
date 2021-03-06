/*
 * Copyright (C) 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.unity.ads;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.LoadAdError;

/**
 * Rewarded interstitial ad events that can be implemented via {@code AndroidJavaProxy} in Unity.
 */
public interface UnityRewardedInterstitialAdCallback extends UnityPaidEventListener {

  void onRewardedInterstitialAdLoaded();

  void onRewardedInterstitialAdFailedToLoad(LoadAdError error);

  void onUserEarnedReward(String type, float amount);

  void onAdFailedToShowFullScreenContent(AdError error);

  void onAdShowedFullScreenContent();

  void onAdDismissedFullScreenContent();
}
