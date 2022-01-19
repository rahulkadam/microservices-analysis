-- Docker Help
1. Create Docker build file with name Dockerfile, Please refer project Dockerfile
2. create docker image with command
        docker build -t mca:balance-enquiry-v1 .
3. docker images   -  to get List of images
4. Run docker image and expose port also
     docker run -p8080:8080 mca:balance-enquiry-v1
5.make sure to provide and create image with Tag, this tag we can use in kubectl config later
   and any other deployment also


-- Kubectl help
1. Create YAML file , which should contain all configuration 
    1. Deployment
    2. Service

2. App Spec
3. Service 
        1. Service contain Type of Port, 
        2. Selector details
        3. Port matching


Some important command to run Yaml file on kubectl
1. kubectl apply -f MCA-BALENQ-deployment.yaml     - Create and apply new yaml config 
2. kubectl logs balance-enquiry-service-bb7b59cd5-5tbpk   - see the logs from pods
3. kubectl get service    -- To get the Service
4. kubectl get deployment    --  to get Deployment
5. 


