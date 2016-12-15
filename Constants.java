package Chat;

import java.awt.Color;

public class Constants {
        public static final String MESSAGE_START = "<message>";
        
        public static final String MESSAGE_NAME = "<message name=";
        
        public static final String MESSAGE_STOP = "</message>";
        
        public static final String BROKEN = "broken message";
        
        public static final String TEXT_START = "<text>";
        
        public static final String TEXT_COLOR = "<text color=";
        
        public static final String TEXT_STOP = "</text>";
        
        public static final String KEY_REQUEST = "<keyrequest type=";
        
        public static final String KEY_REQUEST_STOP = "</keyrequest>";
        
        public static final String KEY_RESPONSE = "<keyresponse key=";
        
        public static final String KEY_RESPONSE_STOP = "</keyresponse>";
        
        public static final String ENCRYPTED_START = "<encrypted>";
        
        public static final String ENCRYPTED_STOP = "</encrypted>";
        
        public static final String ENCRYPTED_TYPE = "<encrypted type=";
        
        public static final String FILE_TYPE = "<filerequest name=";
        
        public static final String FILE_STOP = "</filerequest>";
        
        
        
        
        public static final String BROKEN_ENCRYPTION  = 
                "broken encrypted message";
        
        public static final String[] ENCRYPTIONS = {"AES", "CAESAR"};
        
        
        public static final Color[] colorList = {Color.BLUE, Color.CYAN, 
            Color.DARK_GRAY, Color.GREEN, Color.MAGENTA, Color.ORANGE,
            Color.PINK, Color.RED, Color.YELLOW};
}
