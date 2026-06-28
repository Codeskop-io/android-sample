package com.codeskop.sdk.sample

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

/**
 * Manual-test harness entry point. SKELETON — a real layout with buttons
 * ("Fire API call", "Throw exception", "Force ANR", "Native crash") will be
 * added alongside the capture implementations (docs/03 §3.8).
 */
class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(
            TextView(this).apply {
                text = "Codeskop SDK sample — skeleton.\nWire test actions in Phase 0/3."
            }
        )
        // TODO: Codeskop is auto-initialized via App Startup; identify a fake user
        // and add buttons that exercise each capture path.
    }
}
