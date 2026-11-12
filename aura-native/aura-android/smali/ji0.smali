.class public final Lji0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lvw2;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 3

    .line 1
    iput p1, p0, Lji0;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance p1, Li80;

    .line 10
    .line 11
    const/16 v0, 0x15

    .line 12
    .line 13
    invoke-direct {p1, v0}, Li80;-><init>(I)V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lji0;->b:Ljava/lang/Object;

    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    new-instance p1, Ln83;

    .line 23
    .line 24
    invoke-direct {p1}, Ln83;-><init>()V

    .line 25
    .line 26
    .line 27
    const-wide/16 v0, 0x9c4

    .line 28
    .line 29
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 30
    .line 31
    invoke-virtual {p1, v0, v1, v2}, Ln83;->b(JLjava/util/concurrent/TimeUnit;)V

    .line 32
    .line 33
    .line 34
    invoke-static {v0, v1, v2}, Lze5;->b(JLjava/util/concurrent/TimeUnit;)I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    iput v0, p1, Ln83;->z:I

    .line 39
    .line 40
    sget-object v0, Lx30;->b:Ljavax/net/ssl/SSLSocketFactory;

    .line 41
    .line 42
    if-eqz v0, :cond_0

    .line 43
    .line 44
    sget-object v1, Lx30;->a:Ljavax/net/ssl/X509TrustManager;

    .line 45
    .line 46
    invoke-virtual {p1, v0, v1}, Ln83;->c(Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/X509TrustManager;)V

    .line 47
    .line 48
    .line 49
    :cond_0
    new-instance v0, Lo83;

    .line 50
    .line 51
    invoke-direct {v0, p1}, Lo83;-><init>(Ln83;)V

    .line 52
    .line 53
    .line 54
    iput-object v0, p0, Lji0;->b:Ljava/lang/Object;

    .line 55
    .line 56
    return-void

    .line 57
    :pswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 58
    .line 59
    .line 60
    new-instance p1, Lsi1;

    .line 61
    .line 62
    const/16 v0, 0xb

    .line 63
    .line 64
    invoke-direct {p1, v0}, Lsi1;-><init>(I)V

    .line 65
    .line 66
    .line 67
    iput-object p1, p0, Lji0;->b:Ljava/lang/Object;

    .line 68
    .line 69
    return-void

    .line 70
    nop

    .line 71
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final a(Lna4;)Luw2;
    .locals 1

    .line 1
    iget p1, p0, Lji0;->a:I

    .line 2
    .line 3
    iget-object p0, p0, Lji0;->b:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, Lmw;

    .line 9
    .line 10
    check-cast p0, Lo83;

    .line 11
    .line 12
    const/4 v0, 0x3

    .line 13
    invoke-direct {p1, v0, p0}, Lmw;-><init>(ILjava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return-object p1

    .line 17
    :pswitch_0
    new-instance p1, Lar1;

    .line 18
    .line 19
    check-cast p0, Lsi1;

    .line 20
    .line 21
    invoke-direct {p1, p0}, Lar1;-><init>(Lsi1;)V

    .line 22
    .line 23
    .line 24
    return-object p1

    .line 25
    :pswitch_1
    new-instance p1, Lmw;

    .line 26
    .line 27
    check-cast p0, Li80;

    .line 28
    .line 29
    const/4 v0, 0x1

    .line 30
    invoke-direct {p1, v0, p0}, Lmw;-><init>(ILjava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    return-object p1

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
