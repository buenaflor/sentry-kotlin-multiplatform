import SwiftUI
import shared

@main
struct iOSApp: App {
    init() {
        SentryKMP().start { options in
            options.dsn = "https://83f281ded2844eda83a8a413b080dbb9@o447951.ingest.sentry.io/5903800"
            options.attachThreads = true
            options.attachStackTrace = true
        }
    }

	var body: some Scene {
		WindowGroup {
			ContentView()
		}
	}
}
