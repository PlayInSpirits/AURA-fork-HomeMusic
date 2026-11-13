.class public final Ldefpackage/nk2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/os/Handler$Callback;


# instance fields
.field public final n:Landroid/os/Handler;

.field public final synthetic o:Ldefpackage/ok2;


# direct methods
.method public constructor <init>(Ldefpackage/ok2;Ldefpackage/ak2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldefpackage/nk2;->o:Ldefpackage/ok2;

    .line 5
    .line 6
    invoke-static {p0}, Ldefpackage/f35;->p(Ldefpackage/nk2;)Landroid/os/Handler;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, Ldefpackage/nk2;->n:Landroid/os/Handler;

    .line 11
    .line 12
    invoke-interface {p2, p0, p1}, Ldefpackage/ak2;->v(Ldefpackage/nk2;Landroid/os/Handler;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final a(J)V
    .locals 6

    .line 1
    iget-object v0, p0, Ldefpackage/nk2;->o:Ldefpackage/ok2;

    .line 2
    .line 3
    iget-object v1, v0, Ldefpackage/ok2;->W0:Ldefpackage/rf2;

    .line 4
    .line 5
    iget-object v2, v0, Ldefpackage/ok2;->G1:Ldefpackage/nk2;

    .line 6
    .line 7
    if-ne p0, v2, :cond_5

    .line 8
    .line 9
    iget-object p0, v0, Ldefpackage/gk2;->a0:Ldefpackage/ak2;

    .line 10
    .line 11
    if-nez p0, :cond_0

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_0
    const-wide v2, 0x7fffffffffffffffL

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    cmp-long p0, p1, v2

    .line 20
    .line 21
    const/4 v2, 0x1

    .line 22
    if-nez p0, :cond_1

    .line 23
    .line 24
    iput-boolean v2, v0, Ldefpackage/gk2;->H0:Z

    .line 25
    .line 26
    return-void

    .line 27
    :cond_1
    :try_start_0
    invoke-virtual {v0, p1, p2}, Ldefpackage/gk2;->D0(J)V

    .line 28
    .line 29
    .line 30
    iget-object p0, v0, Ldefpackage/ok2;->B1:Ldefpackage/s55;

    .line 31
    .line 32
    sget-object v3, Ldefpackage/s55;->d:Ldefpackage/s55;

    .line 33
    .line 34
    invoke-virtual {p0, v3}, Ldefpackage/s55;->equals(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-nez v3, :cond_2

    .line 39
    .line 40
    iget-object v3, v0, Ldefpackage/ok2;->C1:Ldefpackage/s55;

    .line 41
    .line 42
    invoke-virtual {p0, v3}, Ldefpackage/s55;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-nez v3, :cond_2

    .line 47
    .line 48
    iput-object p0, v0, Ldefpackage/ok2;->C1:Ldefpackage/s55;

    .line 49
    .line 50
    invoke-virtual {v1, p0}, Ldefpackage/rf2;->o(Ldefpackage/s55;)V

    .line 51
    .line 52
    .line 53
    :cond_2
    iget-object p0, v0, Ldefpackage/gk2;->J0:Ldefpackage/bj0;

    .line 54
    .line 55
    iget v3, p0, Ldefpackage/bj0;->e:I

    .line 56
    .line 57
    add-int/2addr v3, v2

    .line 58
    iput v3, p0, Ldefpackage/bj0;->e:I

    .line 59
    .line 60
    iget-object p0, v0, Ldefpackage/ok2;->Z0:Ldefpackage/e55;

    .line 61
    .line 62
    iget v3, p0, Ldefpackage/e55;->e:I

    .line 63
    .line 64
    const/4 v4, 0x3

    .line 65
    if-eq v3, v4, :cond_3

    .line 66
    .line 67
    move v3, v2

    .line 68
    goto :goto_0

    .line 69
    :cond_3
    const/4 v3, 0x0

    .line 70
    :goto_0
    iput v4, p0, Ldefpackage/e55;->e:I

    .line 71
    .line 72
    iget-object v4, p0, Ldefpackage/e55;->l:Ldefpackage/vp4;

    .line 73
    .line 74
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 78
    .line 79
    .line 80
    move-result-wide v4

    .line 81
    invoke-static {v4, v5}, Ldefpackage/f35;->Q(J)J

    .line 82
    .line 83
    .line 84
    move-result-wide v4

    .line 85
    iput-wide v4, p0, Ldefpackage/e55;->g:J

    .line 86
    .line 87
    if-eqz v3, :cond_4

    .line 88
    .line 89
    iget-object p0, v0, Ldefpackage/ok2;->l1:Landroid/view/Surface;

    .line 90
    .line 91
    if-eqz p0, :cond_4

    .line 92
    .line 93
    invoke-virtual {v1, p0}, Ldefpackage/rf2;->j(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    iput-boolean v2, v0, Ldefpackage/ok2;->o1:Z

    .line 97
    .line 98
    :cond_4
    invoke-virtual {v0, p1, p2}, Ldefpackage/ok2;->i0(J)V
    :try_end_0
    .catch Landroidx/media3/exoplayer/ExoPlaybackException; {:try_start_0 .. :try_end_0} :catch_0

    .line 99
    .line 100
    .line 101
    return-void

    .line 102
    :catch_0
    move-exception p0

    .line 103
    iput-object p0, v0, Ldefpackage/gk2;->I0:Landroidx/media3/exoplayer/ExoPlaybackException;

    .line 104
    .line 105
    :cond_5
    :goto_1
    return-void
.end method

.method public final handleMessage(Landroid/os/Message;)Z
    .locals 6

    .line 1
    iget v0, p1, Landroid/os/Message;->what:I

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return p0

    .line 7
    :cond_0
    iget v0, p1, Landroid/os/Message;->arg1:I

    .line 8
    .line 9
    iget p1, p1, Landroid/os/Message;->arg2:I

    .line 10
    .line 11
    sget-object v1, Ldefpackage/f35;->a:Ljava/lang/String;

    .line 12
    .line 13
    int-to-long v0, v0

    .line 14
    const-wide v2, 0xffffffffL

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    and-long/2addr v0, v2

    .line 20
    const/16 v4, 0x20

    .line 21
    .line 22
    shl-long/2addr v0, v4

    .line 23
    int-to-long v4, p1

    .line 24
    and-long/2addr v2, v4

    .line 25
    or-long/2addr v0, v2

    .line 26
    invoke-virtual {p0, v0, v1}, Ldefpackage/nk2;->a(J)V

    .line 27
    .line 28
    .line 29
    const/4 p0, 0x1

    .line 30
    return p0
.end method
