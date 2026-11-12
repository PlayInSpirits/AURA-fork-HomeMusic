.class public final Lj04;
.super Landroid/net/ConnectivityManager$NetworkCallback;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public a:Z

.field public b:Z

.field public final synthetic c:Lhq1;


# direct methods
.method public constructor <init>(Lhq1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lj04;->c:Lhq1;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/net/ConnectivityManager$NetworkCallback;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onAvailable(Landroid/net/Network;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lj04;->c:Lhq1;

    .line 2
    .line 3
    iget-object p1, p1, Lhq1;->e:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p1, Landroid/os/Handler;

    .line 6
    .line 7
    new-instance v0, Li04;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-direct {v0, p0, v1}, Li04;-><init>(Lj04;I)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final onBlockedStatusChanged(Landroid/net/Network;Z)V
    .locals 1

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    iget-object p1, p0, Lj04;->c:Lhq1;

    .line 4
    .line 5
    iget-object p1, p1, Lhq1;->e:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p1, Landroid/os/Handler;

    .line 8
    .line 9
    new-instance p2, Li04;

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    invoke-direct {p2, p0, v0}, Li04;-><init>(Lj04;I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public final onCapabilitiesChanged(Landroid/net/Network;Landroid/net/NetworkCapabilities;)V
    .locals 2

    .line 1
    const/16 p1, 0x10

    .line 2
    .line 3
    invoke-virtual {p2, p1}, Landroid/net/NetworkCapabilities;->hasCapability(I)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    iget-boolean p2, p0, Lj04;->a:Z

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    iget-object v1, p0, Lj04;->c:Lhq1;

    .line 11
    .line 12
    if-eqz p2, :cond_2

    .line 13
    .line 14
    iget-boolean p2, p0, Lj04;->b:Z

    .line 15
    .line 16
    if-eq p2, p1, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    if-eqz p1, :cond_1

    .line 20
    .line 21
    iget-object p1, v1, Lhq1;->e:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast p1, Landroid/os/Handler;

    .line 24
    .line 25
    new-instance p2, Li04;

    .line 26
    .line 27
    invoke-direct {p2, p0, v0}, Li04;-><init>(Lj04;I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 31
    .line 32
    .line 33
    :cond_1
    return-void

    .line 34
    :cond_2
    :goto_0
    iput-boolean v0, p0, Lj04;->a:Z

    .line 35
    .line 36
    iput-boolean p1, p0, Lj04;->b:Z

    .line 37
    .line 38
    iget-object p1, v1, Lhq1;->e:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p1, Landroid/os/Handler;

    .line 41
    .line 42
    new-instance p2, Li04;

    .line 43
    .line 44
    const/4 v0, 0x0

    .line 45
    invoke-direct {p2, p0, v0}, Li04;-><init>(Lj04;I)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method public final onLost(Landroid/net/Network;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lj04;->c:Lhq1;

    .line 2
    .line 3
    iget-object p1, p1, Lhq1;->e:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p1, Landroid/os/Handler;

    .line 6
    .line 7
    new-instance v0, Li04;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-direct {v0, p0, v1}, Li04;-><init>(Lj04;I)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 14
    .line 15
    .line 16
    return-void
.end method
