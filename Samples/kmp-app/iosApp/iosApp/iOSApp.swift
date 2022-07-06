import SwiftUI
import shared

@main
struct iOSApp: App {
    init() {
        Sentry().captureMessage(msg: "")
    }

	var body: some Scene {
		WindowGroup {
			ContentView()
		}
	}
}
