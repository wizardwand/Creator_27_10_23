FROM openjdk:21

# create a new app directory for my application files
RUN mkdir /app

# Copy the app files from host machine to image filesystem
COPY ./ /app

# Set the directoy for executing future commands
WORKDIR /app

# Run the Main class
CMD java Main