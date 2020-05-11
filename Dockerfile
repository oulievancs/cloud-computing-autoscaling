#From the official Node.js runtime as a pattern Image
FROM node:10

#Set the working directory to /app
WORKDIR /app

#Copy the current directory contents into the container at /app
COPY . /app

# Set instructions on build.
ONBUILD ADD package.json /app/
ONBUILD RUN npm install
ONBUILD ADD . /app

RUN npm install

#Make port 80 available to the world outside this container
EXPOSE 80

#Define enviroment variable
ENV NAME World

#Run Node.js when the conatiner launches
CMD ["npm", "start"]
