from socket import create_server
#https://docs.python.org/3/library/socket.html
#Socket objects have the following methods: socket.accept(), socket.send(), socket.recv(), socket.bind(), socket.close(), socket.listen(), 

#port allocation
server_endpoint = ('',1234) 

with create_server(server_endpoint) as ss:
    print("Server bound to port",server_endpoint[1])
    while True:

        print("Server Listening...")
        #open connection
        (socket, client_endpoint) = ss.accept()
        #I/O send to Client
        with socket:
            print("Connected from: ",client_endpoint)
            socket.send("Hello World!".encode()) #The encode() method converts the string "Hello World!" into its byte representation using the default encoding
                                             #which is UTF-8 unless specified otherwise. Network communication is in Bytes!        
    





