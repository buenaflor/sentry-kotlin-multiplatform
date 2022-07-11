.PHONY: all clean compile stop

all: stop clean compile

# deep clean
clean:
	./gradlew clean
	rm -rf distributions

# build and run tests
compile:
	# ./gradlew build
	xcodebuild build -workspace ./sentry-samples/kmp-app/iosApp/iosApp.xcworkspace -scheme iosApp CODE_SIGN_IDENTITY="" CODE_SIGNING_REQUIRED=NO

# We stop gradle at the end to make sure the cache folders
# don't contain any lock files and are free to be cached.
stop:
	./gradlew --stop
