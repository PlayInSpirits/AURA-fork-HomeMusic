.class public final Ly24;
.super Lq12;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final synthetic b:Lt24;


# direct methods
.method public constructor <init>([Ljava/lang/String;Lt24;)V
    .locals 0

    .line 1
    iput-object p2, p0, Ly24;->b:Lt24;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lq12;-><init>([Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Ljava/util/Set;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lei;->V()Lei;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    new-instance v0, Ljq3;

    .line 9
    .line 10
    const/4 v1, 0x5

    .line 11
    iget-object p0, p0, Ly24;->b:Lt24;

    .line 12
    .line 13
    invoke-direct {v0, v1, p0}, Ljq3;-><init>(ILjava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    iget-object p0, p1, Lei;->j:Lbn0;

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {p0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    if-ne p0, v1, :cond_0

    .line 34
    .line 35
    const/4 p0, 0x1

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    const/4 p0, 0x0

    .line 38
    :goto_0
    if-eqz p0, :cond_1

    .line 39
    .line 40
    invoke-virtual {v0}, Ljq3;->run()V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_1
    invoke-virtual {p1, v0}, Lei;->W(Ljava/lang/Runnable;)V

    .line 45
    .line 46
    .line 47
    return-void
.end method
