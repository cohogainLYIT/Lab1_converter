## Lab1_converter

# Continuous Integration and Continuous Deployment pipeline using GitHub Actions

This is a test repository for implementing a CI/CD  workflow using GitHub Actions. When code is pushed to this repo, an automated workflow is triggered which builds and tests the source code using maven. This is followed by an automatic build and publish of a Docker image to Docker Hub.

# Download and run the Docker image

$ sudo apt install docker.io                                                                
$ docker pull cohogainlyit/converter:latest                                                                                                      
$ docker run -it cohogainlyit/converter

If you get a permission denied error, run the following command to fix:

$ sudo chmod 666 /var/run/docker.sock

