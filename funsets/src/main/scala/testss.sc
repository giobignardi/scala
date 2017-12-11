type Set = Int => Boolean

def s :Set = x => x>0 & x<0

def t :Set = x => x>100 & x<100

union(t,s)==t



