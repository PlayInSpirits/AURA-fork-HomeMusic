.class public final Ldefpackage/mj2;
.super Ldefpackage/uj2;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final synthetic e:Ldefpackage/oj2;

.field public final synthetic f:Ljava/lang/String;

.field public final synthetic g:Landroid/os/Bundle;

.field public final synthetic h:Landroid/os/Bundle;

.field public final synthetic i:Ldefpackage/pn2;


# direct methods
.method public constructor <init>(Ldefpackage/pn2;Ljava/lang/String;Ldefpackage/oj2;Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ldefpackage/mj2;->i:Ldefpackage/pn2;

    .line 2
    .line 3
    iput-object p3, p0, Ldefpackage/mj2;->e:Ldefpackage/oj2;

    .line 4
    .line 5
    iput-object p4, p0, Ldefpackage/mj2;->f:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p5, p0, Ldefpackage/mj2;->g:Landroid/os/Bundle;

    .line 8
    .line 9
    iput-object p6, p0, Ldefpackage/mj2;->h:Landroid/os/Bundle;

    .line 10
    .line 11
    invoke-direct {p0, p2}, Ldefpackage/uj2;-><init>(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final d(Ljava/lang/Object;)V
    .locals 6

    .line 1
    check-cast p1, Ljava/util/List;

    .line 2
    .line 3
    iget-object v0, p0, Ldefpackage/mj2;->i:Ldefpackage/pn2;

    .line 4
    .line 5
    iget-object v0, v0, Ldefpackage/pn2;->r:Ldefpackage/oi;

    .line 6
    .line 7
    iget-object v1, p0, Ldefpackage/mj2;->e:Ldefpackage/oj2;

    .line 8
    .line 9
    iget-object v2, v1, Ldefpackage/oj2;->e:Ldefpackage/hg3;

    .line 10
    .line 11
    iget-object v3, v1, Ldefpackage/oj2;->a:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    iget-object v4, v2, Ldefpackage/hg3;->o:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v4, Landroid/os/Messenger;

    .line 19
    .line 20
    invoke-virtual {v4}, Landroid/os/Messenger;->getBinder()Landroid/os/IBinder;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    invoke-virtual {v0, v4}, Ldefpackage/yd4;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    const-string v4, "MBServiceCompat"

    .line 29
    .line 30
    iget-object v5, p0, Ldefpackage/mj2;->f:Ljava/lang/String;

    .line 31
    .line 32
    if-eq v0, v1, :cond_0

    .line 33
    .line 34
    new-instance p0, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    const-string p1, "Not sending onLoadChildren result for connection that has been disconnected. pkg="

    .line 37
    .line 38
    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string p1, " id="

    .line 45
    .line 46
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    invoke-static {v4, p0}, Ldefpackage/l93;->A(Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :cond_0
    :try_start_0
    iget-object v0, p0, Ldefpackage/mj2;->g:Landroid/os/Bundle;

    .line 61
    .line 62
    iget-object p0, p0, Ldefpackage/mj2;->h:Landroid/os/Bundle;

    .line 63
    .line 64
    invoke-virtual {v2, v5, p1, v0, p0}, Ldefpackage/hg3;->H(Ljava/lang/String;Ljava/util/List;Landroid/os/Bundle;Landroid/os/Bundle;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :catch_0
    new-instance p0, Ljava/lang/StringBuilder;

    .line 69
    .line 70
    const-string p1, "Calling onLoadChildren() failed for id="

    .line 71
    .line 72
    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    const-string p1, " package="

    .line 79
    .line 80
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    invoke-static {v4, p0}, Ldefpackage/l93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    return-void
.end method
