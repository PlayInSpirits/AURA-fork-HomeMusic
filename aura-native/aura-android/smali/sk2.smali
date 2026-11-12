.class public Lsk2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lqi3;


# instance fields
.field public final b:Lbu4;

.field public c:Z

.field public final d:Lrk2;

.field public final e:Lqk2;

.field public final f:Landroid/os/Handler;

.field public final g:J

.field public h:Z

.field public final i:Lbl2;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcb4;Landroid/os/Bundle;Lqk2;Landroid/os/Looper;Lbl2;Lxc5;)V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "context must not be null"

    .line 5
    .line 6
    invoke-static {p1, v0}, Lrr2;->s(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    const-string v0, "token must not be null"

    .line 10
    .line 11
    invoke-static {p2, v0}, Lrr2;->s(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    new-instance v0, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    const-string v1, "Init "

    .line 17
    .line 18
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string v1, " [AndroidXMedia3/1.9.2] ["

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    sget-object v1, Lf35;->a:Ljava/lang/String;

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string v1, "]"

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    const-string v1, "MediaController"

    .line 52
    .line 53
    invoke-static {v1, v0}, Ll93;->K(Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    new-instance v0, Lbu4;

    .line 57
    .line 58
    invoke-direct {v0}, Lbu4;-><init>()V

    .line 59
    .line 60
    .line 61
    iput-object v0, p0, Lsk2;->b:Lbu4;

    .line 62
    .line 63
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    iput-wide v0, p0, Lsk2;->g:J

    .line 69
    .line 70
    iput-object p4, p0, Lsk2;->e:Lqk2;

    .line 71
    .line 72
    new-instance p4, Landroid/os/Handler;

    .line 73
    .line 74
    invoke-direct {p4, p5}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 75
    .line 76
    .line 77
    iput-object p4, p0, Lsk2;->f:Landroid/os/Handler;

    .line 78
    .line 79
    iput-object p6, p0, Lsk2;->i:Lbl2;

    .line 80
    .line 81
    move-object v0, p0

    .line 82
    move-object v1, p1

    .line 83
    move-object v2, p2

    .line 84
    move-object v3, p3

    .line 85
    move-object v4, p5

    .line 86
    move-object v5, p7

    .line 87
    invoke-virtual/range {v0 .. v5}, Lsk2;->W0(Landroid/content/Context;Lcb4;Landroid/os/Bundle;Landroid/os/Looper;Lxs;)Lrk2;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    iput-object p0, v0, Lsk2;->d:Lrk2;

    .line 92
    .line 93
    invoke-interface {p0}, Lrk2;->R0()V

    .line 94
    .line 95
    .line 96
    return-void
.end method

.method public static Z0(Ljava/util/concurrent/Future;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-interface {p0, v0}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    :try_start_0
    invoke-static {p0}, Lhw;->j(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, Lsk2;
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    .line 15
    invoke-virtual {p0}, Lsk2;->Y0()V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :catch_0
    move-exception p0

    .line 20
    const-string v0, "MediaController"

    .line 21
    .line 22
    const-string v1, "MediaController future failed (so we couldn\'t release it)"

    .line 23
    .line 24
    invoke-static {v0, v1, p0}, Ll93;->r0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method


# virtual methods
.method public final A()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lsk2;->c1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lsk2;->d:Lrk2;

    .line 5
    .line 6
    invoke-interface {p0}, Lrk2;->Y()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const-string p0, "MediaController"

    .line 13
    .line 14
    const-string v0, "The controller is not connected. Ignoring seekToPreviousMediaItem()."

    .line 15
    .line 16
    invoke-static {p0, v0}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    invoke-interface {p0}, Lrk2;->A()V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final A0()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lsk2;->c1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lsk2;->d:Lrk2;

    .line 5
    .line 6
    invoke-interface {p0}, Lrk2;->Y()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const-string p0, "MediaController"

    .line 13
    .line 14
    const-string v0, "The controller is not connected. Ignoring mute()."

    .line 15
    .line 16
    invoke-static {p0, v0}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    invoke-interface {p0}, Lrk2;->A0()V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final B()F
    .locals 1

    .line 1
    invoke-virtual {p0}, Lsk2;->c1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lsk2;->d:Lrk2;

    .line 5
    .line 6
    invoke-interface {p0}, Lrk2;->Y()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-interface {p0}, Lrk2;->B()F

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0

    .line 17
    :cond_0
    const/high16 p0, 0x3f800000    # 1.0f

    .line 18
    .line 19
    return p0
.end method

.method public final B0(Lgn2;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lsk2;->c1()V

    .line 2
    .line 3
    .line 4
    const-string v0, "mediaItems must not be null"

    .line 5
    .line 6
    invoke-static {p1, v0}, Lrr2;->s(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, Lsk2;->d:Lrk2;

    .line 10
    .line 11
    invoke-interface {p0}, Lrk2;->Y()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    const-string p0, "MediaController"

    .line 18
    .line 19
    const-string p1, "The controller is not connected. Ignoring setMediaItems()."

    .line 20
    .line 21
    invoke-static {p0, p1}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    invoke-interface {p0, p1}, Lrk2;->B0(Lgn2;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final C()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lsk2;->c1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lsk2;->d:Lrk2;

    .line 5
    .line 6
    invoke-interface {p0}, Lrk2;->Y()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const-string p0, "MediaController"

    .line 13
    .line 14
    const-string v0, "The controller is not connected. Ignoring seekTo()."

    .line 15
    .line 16
    invoke-static {p0, v0}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    invoke-interface {p0}, Lrk2;->C()V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final C0()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lsk2;->c1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lsk2;->d:Lrk2;

    .line 5
    .line 6
    invoke-interface {p0}, Lrk2;->Y()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const-string p0, "MediaController"

    .line 13
    .line 14
    const-string v0, "The controller is not connected. Ignoring increaseDeviceVolume()."

    .line 15
    .line 16
    invoke-static {p0, v0}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    invoke-interface {p0}, Lrk2;->C0()V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final D()Lil;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lsk2;->c1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lsk2;->d:Lrk2;

    .line 5
    .line 6
    invoke-interface {p0}, Lrk2;->Y()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    sget-object p0, Lil;->i:Lil;

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_0
    invoke-interface {p0}, Lrk2;->D()Lil;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method

.method public final D0()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lsk2;->c1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lsk2;->d:Lrk2;

    .line 5
    .line 6
    invoke-interface {p0}, Lrk2;->Y()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-interface {p0}, Lrk2;->D0()Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    const/4 p0, 0x1

    .line 19
    return p0

    .line 20
    :cond_0
    const/4 p0, 0x0

    .line 21
    return p0
.end method

.method public final E(IZ)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lsk2;->c1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lsk2;->d:Lrk2;

    .line 5
    .line 6
    invoke-interface {p0}, Lrk2;->Y()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const-string p0, "MediaController"

    .line 13
    .line 14
    const-string p1, "The controller is not connected. Ignoring setDeviceMuted()."

    .line 15
    .line 16
    invoke-static {p0, p1}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    invoke-interface {p0, p1, p2}, Lrk2;->E(IZ)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final E0()Lcw4;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lsk2;->c1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lsk2;->d:Lrk2;

    .line 5
    .line 6
    invoke-interface {p0}, Lrk2;->Y()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    sget-object p0, Lcw4;->J:Lcw4;

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_0
    invoke-interface {p0}, Lrk2;->E0()Lcw4;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method

.method public final F()Lhp0;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lsk2;->c1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lsk2;->d:Lrk2;

    .line 5
    .line 6
    invoke-interface {p0}, Lrk2;->Y()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    sget-object p0, Lhp0;->e:Lhp0;

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_0
    invoke-interface {p0}, Lrk2;->F()Lhp0;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method

.method public final F0()J
    .locals 2

    .line 1
    invoke-virtual {p0}, Lsk2;->c1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lsk2;->d:Lrk2;

    .line 5
    .line 6
    invoke-interface {p0}, Lrk2;->Y()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-interface {p0}, Lrk2;->F0()J

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    return-wide v0

    .line 17
    :cond_0
    const-wide/16 v0, 0x0

    .line 18
    .line 19
    return-wide v0
.end method

.method public final G()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lsk2;->c1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lsk2;->d:Lrk2;

    .line 5
    .line 6
    invoke-interface {p0}, Lrk2;->Y()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const-string p0, "MediaController"

    .line 13
    .line 14
    const-string v0, "The controller is not connected. Ignoring decreaseDeviceVolume()."

    .line 15
    .line 16
    invoke-static {p0, v0}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    invoke-interface {p0}, Lrk2;->G()V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final G0(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lsk2;->c1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lsk2;->d:Lrk2;

    .line 5
    .line 6
    invoke-interface {p0}, Lrk2;->Y()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const-string p0, "MediaController"

    .line 13
    .line 14
    const-string p1, "The controller is not connected. Ignoring setDeviceVolume()."

    .line 15
    .line 16
    invoke-static {p0, p1}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    invoke-interface {p0, p1}, Lrk2;->G0(I)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final H(II)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lsk2;->c1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lsk2;->d:Lrk2;

    .line 5
    .line 6
    invoke-interface {p0}, Lrk2;->Y()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const-string p0, "MediaController"

    .line 13
    .line 14
    const-string p1, "The controller is not connected. Ignoring setDeviceVolume()."

    .line 15
    .line 16
    invoke-static {p0, p1}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    invoke-interface {p0, p1, p2}, Lrk2;->H(II)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final H0()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lsk2;->c1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lsk2;->d:Lrk2;

    .line 5
    .line 6
    invoke-interface {p0}, Lrk2;->Y()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const-string p0, "MediaController"

    .line 13
    .line 14
    const-string v0, "The controller is not connected. Ignoring seekToNext()."

    .line 15
    .line 16
    invoke-static {p0, v0}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    invoke-interface {p0}, Lrk2;->H0()V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final I()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lsk2;->c1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lsk2;->d:Lrk2;

    .line 5
    .line 6
    invoke-interface {p0}, Lrk2;->Y()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-interface {p0}, Lrk2;->I()Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    const/4 p0, 0x1

    .line 19
    return p0

    .line 20
    :cond_0
    const/4 p0, 0x0

    .line 21
    return p0
.end method

.method public final I0()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lsk2;->c1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lsk2;->d:Lrk2;

    .line 5
    .line 6
    invoke-interface {p0}, Lrk2;->Y()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const-string p0, "MediaController"

    .line 13
    .line 14
    const-string v0, "The controller is not connected. Ignoring seekForward()."

    .line 15
    .line 16
    invoke-static {p0, v0}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    invoke-interface {p0}, Lrk2;->I0()V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final J(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lsk2;->c1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lsk2;->d:Lrk2;

    .line 5
    .line 6
    invoke-interface {p0}, Lrk2;->Y()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const-string p0, "MediaController"

    .line 13
    .line 14
    const-string p1, "The controller is not connected. Ignoring increaseDeviceVolume()."

    .line 15
    .line 16
    invoke-static {p0, p1}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    invoke-interface {p0, p1}, Lrk2;->J(I)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final J0()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lsk2;->c1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lsk2;->d:Lrk2;

    .line 5
    .line 6
    invoke-interface {p0}, Lrk2;->Y()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const-string p0, "MediaController"

    .line 13
    .line 14
    const-string v0, "The controller is not connected. Ignoring seekBack()."

    .line 15
    .line 16
    invoke-static {p0, v0}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    invoke-interface {p0}, Lrk2;->J0()V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final K()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lsk2;->c1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lsk2;->d:Lrk2;

    .line 5
    .line 6
    invoke-interface {p0}, Lrk2;->Y()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-interface {p0}, Lrk2;->K()I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0

    .line 17
    :cond_0
    const/4 p0, -0x1

    .line 18
    return p0
.end method

.method public final K0()Ldo2;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lsk2;->c1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lsk2;->d:Lrk2;

    .line 5
    .line 6
    invoke-interface {p0}, Lrk2;->Y()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-interface {p0}, Lrk2;->K0()Ldo2;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0

    .line 17
    :cond_0
    sget-object p0, Ldo2;->K:Ldo2;

    .line 18
    .line 19
    return-object p0
.end method

.method public final L(IILjava/util/List;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lsk2;->c1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lsk2;->d:Lrk2;

    .line 5
    .line 6
    invoke-interface {p0}, Lrk2;->Y()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const-string p0, "MediaController"

    .line 13
    .line 14
    const-string p1, "The controller is not connected. Ignoring replaceMediaItems()."

    .line 15
    .line 16
    invoke-static {p0, p1}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    invoke-interface {p0, p1, p2, p3}, Lrk2;->L(IILjava/util/List;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final L0(Ljava/util/List;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lsk2;->c1()V

    .line 2
    .line 3
    .line 4
    const-string v0, "mediaItems must not be null"

    .line 5
    .line 6
    invoke-static {p1, v0}, Lrr2;->s(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    move v1, v0

    .line 11
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-ge v1, v2, :cond_1

    .line 16
    .line 17
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    const/4 v2, 0x1

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    move v2, v0

    .line 26
    :goto_1
    const-string v3, "items must not contain null, index=%s"

    .line 27
    .line 28
    invoke-static {v1, v3, v2}, Lrr2;->j(ILjava/lang/String;Z)V

    .line 29
    .line 30
    .line 31
    add-int/lit8 v1, v1, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    iget-object p0, p0, Lsk2;->d:Lrk2;

    .line 35
    .line 36
    invoke-interface {p0}, Lrk2;->Y()Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-nez v0, :cond_2

    .line 41
    .line 42
    const-string p0, "MediaController"

    .line 43
    .line 44
    const-string p1, "The controller is not connected. Ignoring setMediaItems()."

    .line 45
    .line 46
    invoke-static {p0, p1}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :cond_2
    invoke-interface {p0, p1}, Lrk2;->V0(Ljava/util/List;)V

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method public final M(Lcw4;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lsk2;->c1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lsk2;->d:Lrk2;

    .line 5
    .line 6
    invoke-interface {p0}, Lrk2;->Y()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const-string v0, "MediaController"

    .line 13
    .line 14
    const-string v1, "The controller is not connected. Ignoring setTrackSelectionParameters()."

    .line 15
    .line 16
    invoke-static {v0, v1}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    invoke-interface {p0, p1}, Lrk2;->M(Lcw4;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final M0()J
    .locals 2

    .line 1
    invoke-virtual {p0}, Lsk2;->c1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lsk2;->d:Lrk2;

    .line 5
    .line 6
    invoke-interface {p0}, Lrk2;->Y()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-interface {p0}, Lrk2;->M0()J

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    return-wide v0

    .line 17
    :cond_0
    const-wide/16 v0, 0x0

    .line 18
    .line 19
    return-wide v0
.end method

.method public final N(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lsk2;->c1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lsk2;->d:Lrk2;

    .line 5
    .line 6
    invoke-interface {p0}, Lrk2;->Y()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const-string p0, "MediaController"

    .line 13
    .line 14
    const-string p1, "The controller is not connected. Ignoring removeMediaItem()."

    .line 15
    .line 16
    invoke-static {p0, p1}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    invoke-interface {p0, p1}, Lrk2;->N(I)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final N0(Ljava/util/List;I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lsk2;->c1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lsk2;->d:Lrk2;

    .line 5
    .line 6
    invoke-interface {p0}, Lrk2;->Y()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const-string p0, "MediaController"

    .line 13
    .line 14
    const-string p1, "The controller is not connected. Ignoring addMediaItems()."

    .line 15
    .line 16
    invoke-static {p0, p1}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    invoke-interface {p0, p1, p2}, Lrk2;->N0(Ljava/util/List;I)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final O(J)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lsk2;->c1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lsk2;->d:Lrk2;

    .line 5
    .line 6
    invoke-interface {p0}, Lrk2;->Y()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const-string p0, "MediaController"

    .line 13
    .line 14
    const-string p1, "The controller is not connected. Ignoring seekTo()."

    .line 15
    .line 16
    invoke-static {p0, p1}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    invoke-interface {p0, p1, p2}, Lrk2;->O(J)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final O0()J
    .locals 2

    .line 1
    invoke-virtual {p0}, Lsk2;->c1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lsk2;->d:Lrk2;

    .line 5
    .line 6
    invoke-interface {p0}, Lrk2;->Y()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-interface {p0}, Lrk2;->O0()J

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    return-wide v0

    .line 17
    :cond_0
    const-wide/16 v0, 0x0

    .line 18
    .line 19
    return-wide v0
.end method

.method public final P(II)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lsk2;->c1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lsk2;->d:Lrk2;

    .line 5
    .line 6
    invoke-interface {p0}, Lrk2;->Y()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const-string p0, "MediaController"

    .line 13
    .line 14
    const-string p1, "The controller is not connected. Ignoring removeMediaItems()."

    .line 15
    .line 16
    invoke-static {p0, p1}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    invoke-interface {p0, p1, p2}, Lrk2;->P(II)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final P0()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final Q(Landroid/view/SurfaceHolder;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lsk2;->c1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lsk2;->d:Lrk2;

    .line 5
    .line 6
    invoke-interface {p0}, Lrk2;->Y()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const-string p0, "MediaController"

    .line 13
    .line 14
    const-string p1, "The controller is not connected. Ignoring setVideoSurfaceHolder()."

    .line 15
    .line 16
    invoke-static {p0, p1}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    invoke-interface {p0, p1}, Lrk2;->Q(Landroid/view/SurfaceHolder;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final Q0()I
    .locals 0

    .line 1
    invoke-virtual {p0}, Lsk2;->x0()Lcu4;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lcu4;->o()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final R(F)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lsk2;->c1()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    cmpl-float v0, p1, v0

    .line 6
    .line 7
    if-ltz v0, :cond_0

    .line 8
    .line 9
    const/high16 v0, 0x3f800000    # 1.0f

    .line 10
    .line 11
    cmpg-float v0, p1, v0

    .line 12
    .line 13
    if-gtz v0, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    :goto_0
    const-string v1, "volume must be between 0 and 1"

    .line 19
    .line 20
    invoke-static {v1, v0}, Lrr2;->k(Ljava/lang/String;Z)V

    .line 21
    .line 22
    .line 23
    iget-object p0, p0, Lsk2;->d:Lrk2;

    .line 24
    .line 25
    invoke-interface {p0}, Lrk2;->Y()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-nez v0, :cond_1

    .line 30
    .line 31
    const-string p0, "MediaController"

    .line 32
    .line 33
    const-string p1, "The controller is not connected. Ignoring setVolume()."

    .line 34
    .line 35
    invoke-static {p0, p1}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_1
    invoke-interface {p0, p1}, Lrk2;->R(F)V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public final R0()Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Lsk2;->c1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lsk2;->x0()Lcu4;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Lcu4;->p()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, Lsk2;->o0()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    iget-object p0, p0, Lsk2;->b:Lbu4;

    .line 19
    .line 20
    const-wide/16 v2, 0x0

    .line 21
    .line 22
    invoke-virtual {v0, v1, p0, v2, v3}, Lcu4;->m(ILbu4;J)Lbu4;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    iget-boolean p0, p0, Lbu4;->g:Z

    .line 27
    .line 28
    if-eqz p0, :cond_0

    .line 29
    .line 30
    const/4 p0, 0x1

    .line 31
    return p0

    .line 32
    :cond_0
    const/4 p0, 0x0

    .line 33
    return p0
.end method

.method public final S()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lsk2;->c1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lsk2;->d:Lrk2;

    .line 5
    .line 6
    invoke-interface {p0}, Lrk2;->Y()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const-string p0, "MediaController"

    .line 13
    .line 14
    const-string v0, "The controller is not connected. Ignoring seekToPrevious()."

    .line 15
    .line 16
    invoke-static {p0, v0}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    invoke-interface {p0}, Lrk2;->S()V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final S0(I)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Lsk2;->o()Lmi3;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1}, Lmi3;->a(I)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final T(Ljava/util/List;IJ)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lsk2;->c1()V

    .line 2
    .line 3
    .line 4
    const-string v0, "mediaItems must not be null"

    .line 5
    .line 6
    invoke-static {p1, v0}, Lrr2;->s(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    move v1, v0

    .line 11
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-ge v1, v2, :cond_1

    .line 16
    .line 17
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    const/4 v2, 0x1

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    move v2, v0

    .line 26
    :goto_1
    const-string v3, "items must not contain null, index=%s"

    .line 27
    .line 28
    invoke-static {v1, v3, v2}, Lrr2;->j(ILjava/lang/String;Z)V

    .line 29
    .line 30
    .line 31
    add-int/lit8 v1, v1, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    iget-object p0, p0, Lsk2;->d:Lrk2;

    .line 35
    .line 36
    invoke-interface {p0}, Lrk2;->Y()Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-nez v0, :cond_2

    .line 41
    .line 42
    const-string p0, "MediaController"

    .line 43
    .line 44
    const-string p1, "The controller is not connected. Ignoring setMediaItems()."

    .line 45
    .line 46
    invoke-static {p0, p1}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :cond_2
    invoke-interface {p0, p1, p2, p3, p4}, Lrk2;->T(Ljava/util/List;IJ)V

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method public final T0()Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Lsk2;->c1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lsk2;->x0()Lcu4;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Lcu4;->p()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, Lsk2;->o0()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    iget-object p0, p0, Lsk2;->b:Lbu4;

    .line 19
    .line 20
    const-wide/16 v2, 0x0

    .line 21
    .line 22
    invoke-virtual {v0, v1, p0, v2, v3}, Lcu4;->m(ILbu4;J)Lbu4;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    iget-boolean p0, p0, Lbu4;->h:Z

    .line 27
    .line 28
    if-eqz p0, :cond_0

    .line 29
    .line 30
    const/4 p0, 0x1

    .line 31
    return p0

    .line 32
    :cond_0
    const/4 p0, 0x0

    .line 33
    return p0
.end method

.method public final U()Landroidx/media3/common/PlaybackException;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lsk2;->c1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lsk2;->d:Lrk2;

    .line 5
    .line 6
    invoke-interface {p0}, Lrk2;->Y()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-interface {p0}, Lrk2;->U()Landroidx/media3/common/PlaybackException;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0

    .line 17
    :cond_0
    const/4 p0, 0x0

    .line 18
    return-object p0
.end method

.method public final U0()Landroid/os/Looper;
    .locals 0

    .line 1
    iget-object p0, p0, Lsk2;->f:Landroid/os/Handler;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final V(Z)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lsk2;->c1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lsk2;->d:Lrk2;

    .line 5
    .line 6
    invoke-interface {p0}, Lrk2;->Y()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-interface {p0, p1}, Lrk2;->V(Z)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public final V0()Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Lsk2;->c1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lsk2;->x0()Lcu4;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Lcu4;->p()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, Lsk2;->o0()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    iget-object p0, p0, Lsk2;->b:Lbu4;

    .line 19
    .line 20
    const-wide/16 v2, 0x0

    .line 21
    .line 22
    invoke-virtual {v0, v1, p0, v2, v3}, Lcu4;->m(ILbu4;J)Lbu4;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {p0}, Lbu4;->a()Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    if-eqz p0, :cond_0

    .line 31
    .line 32
    const/4 p0, 0x1

    .line 33
    return p0

    .line 34
    :cond_0
    const/4 p0, 0x0

    .line 35
    return p0
.end method

.method public final W(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lsk2;->c1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lsk2;->d:Lrk2;

    .line 5
    .line 6
    invoke-interface {p0}, Lrk2;->Y()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const-string p0, "MediaController"

    .line 13
    .line 14
    const-string p1, "The controller is not connected. Ignoring seekTo()."

    .line 15
    .line 16
    invoke-static {p0, p1}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    invoke-interface {p0, p1}, Lrk2;->W(I)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public W0(Landroid/content/Context;Lcb4;Landroid/os/Bundle;Landroid/os/Looper;Lxs;)Lrk2;
    .locals 8

    .line 1
    iget-object v0, p2, Lcb4;->a:Lbb4;

    .line 2
    .line 3
    invoke-interface {v0}, Lbb4;->e()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    new-instance v1, Lim2;

    .line 10
    .line 11
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-object v3, p0

    .line 15
    move-object v2, p1

    .line 16
    move-object v4, p2

    .line 17
    move-object v5, p3

    .line 18
    move-object v6, p4

    .line 19
    move-object v7, p5

    .line 20
    invoke-direct/range {v1 .. v7}, Lim2;-><init>(Landroid/content/Context;Lsk2;Lcb4;Landroid/os/Bundle;Landroid/os/Looper;Lxs;)V

    .line 21
    .line 22
    .line 23
    return-object v1

    .line 24
    :cond_0
    move-object p5, p4

    .line 25
    move-object p4, p3

    .line 26
    move-object p3, p2

    .line 27
    move-object p2, p0

    .line 28
    new-instance p0, Lbm2;

    .line 29
    .line 30
    invoke-direct/range {p0 .. p5}, Lbm2;-><init>(Landroid/content/Context;Lsk2;Lcb4;Landroid/os/Bundle;Landroid/os/Looper;)V

    .line 31
    .line 32
    .line 33
    return-object p0
.end method

.method public final X()J
    .locals 2

    .line 1
    invoke-virtual {p0}, Lsk2;->c1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lsk2;->d:Lrk2;

    .line 5
    .line 6
    invoke-interface {p0}, Lrk2;->Y()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-interface {p0}, Lrk2;->X()J

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    return-wide v0

    .line 17
    :cond_0
    const-wide/16 v0, 0x0

    .line 18
    .line 19
    return-wide v0
.end method

.method public final X0()V
    .locals 3

    .line 1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lsk2;->f:Landroid/os/Handler;

    .line 6
    .line 7
    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const/4 v2, 0x1

    .line 12
    if-ne v0, v1, :cond_0

    .line 13
    .line 14
    move v0, v2

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    :goto_0
    invoke-static {v0}, Lrr2;->w(Z)V

    .line 18
    .line 19
    .line 20
    iget-boolean v0, p0, Lsk2;->h:Z

    .line 21
    .line 22
    xor-int/2addr v0, v2

    .line 23
    invoke-static {v0}, Lrr2;->w(Z)V

    .line 24
    .line 25
    .line 26
    iput-boolean v2, p0, Lsk2;->h:Z

    .line 27
    .line 28
    iget-object p0, p0, Lsk2;->i:Lbl2;

    .line 29
    .line 30
    iput-boolean v2, p0, Lbl2;->w:Z

    .line 31
    .line 32
    iget-object v0, p0, Lbl2;->v:Lsk2;

    .line 33
    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    invoke-virtual {p0, v0}, Lu0;->l(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    :cond_1
    return-void
.end method

.method public final Y(I)Lgn2;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lsk2;->x0()Lcu4;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object p0, p0, Lsk2;->b:Lbu4;

    .line 6
    .line 7
    const-wide/16 v1, 0x0

    .line 8
    .line 9
    invoke-virtual {v0, p1, p0, v1, v2}, Lcu4;->m(ILbu4;J)Lbu4;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    iget-object p0, p0, Lbu4;->b:Lgn2;

    .line 14
    .line 15
    return-object p0
.end method

.method public final Y0()V
    .locals 4

    .line 1
    const-string v0, "MediaController"

    .line 2
    .line 3
    invoke-virtual {p0}, Lsk2;->c1()V

    .line 4
    .line 5
    .line 6
    iget-boolean v1, p0, Lsk2;->c:Z

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    goto/16 :goto_2

    .line 11
    .line 12
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v2, "Release "

    .line 15
    .line 16
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    invoke-static {v2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v2, " [AndroidXMedia3/1.9.2] ["

    .line 31
    .line 32
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    sget-object v2, Lf35;->a:Ljava/lang/String;

    .line 36
    .line 37
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v2, "] ["

    .line 41
    .line 42
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    sget-object v2, Lhn2;->a:Ljava/util/HashSet;

    .line 46
    .line 47
    const-class v2, Lhn2;

    .line 48
    .line 49
    monitor-enter v2

    .line 50
    :try_start_0
    sget-object v3, Lhn2;->b:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    .line 52
    monitor-exit v2

    .line 53
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    const-string v2, "]"

    .line 57
    .line 58
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-static {v0, v1}, Ll93;->K(Ljava/lang/String;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    const/4 v1, 0x1

    .line 69
    iput-boolean v1, p0, Lsk2;->c:Z

    .line 70
    .line 71
    iget-object v2, p0, Lsk2;->f:Landroid/os/Handler;

    .line 72
    .line 73
    const/4 v3, 0x0

    .line 74
    invoke-virtual {v2, v3}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    :try_start_1
    iget-object v2, p0, Lsk2;->d:Lrk2;

    .line 78
    .line 79
    invoke-interface {v2}, Lrk2;->a()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 80
    .line 81
    .line 82
    goto :goto_0

    .line 83
    :catch_0
    move-exception v2

    .line 84
    const-string v3, "Exception while releasing impl"

    .line 85
    .line 86
    invoke-static {v0, v3, v2}, Ll93;->B(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 87
    .line 88
    .line 89
    :goto_0
    iget-boolean v0, p0, Lsk2;->h:Z

    .line 90
    .line 91
    if-eqz v0, :cond_2

    .line 92
    .line 93
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    iget-object v2, p0, Lsk2;->f:Landroid/os/Handler;

    .line 98
    .line 99
    invoke-virtual {v2}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    if-ne v0, v2, :cond_1

    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_1
    const/4 v1, 0x0

    .line 107
    :goto_1
    invoke-static {v1}, Lrr2;->w(Z)V

    .line 108
    .line 109
    .line 110
    iget-object p0, p0, Lsk2;->e:Lqk2;

    .line 111
    .line 112
    invoke-interface {p0}, Lqk2;->c()V

    .line 113
    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_2
    iput-boolean v1, p0, Lsk2;->h:Z

    .line 117
    .line 118
    iget-object p0, p0, Lsk2;->i:Lbl2;

    .line 119
    .line 120
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    new-instance v0, Ljava/lang/SecurityException;

    .line 124
    .line 125
    const-string v1, "Session rejected the connection request."

    .line 126
    .line 127
    invoke-direct {v0, v1}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {p0, v0}, Lu0;->m(Ljava/lang/Throwable;)Z

    .line 131
    .line 132
    .line 133
    :goto_2
    return-void

    .line 134
    :catchall_0
    move-exception p0

    .line 135
    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 136
    throw p0
.end method

.method public final Z()J
    .locals 2

    .line 1
    invoke-virtual {p0}, Lsk2;->c1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lsk2;->d:Lrk2;

    .line 5
    .line 6
    invoke-interface {p0}, Lrk2;->Y()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-interface {p0}, Lrk2;->Z()J

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    return-wide v0

    .line 17
    :cond_0
    const-wide/16 v0, 0x0

    .line 18
    .line 19
    return-wide v0
.end method

.method public final a()Lgn2;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lsk2;->x0()Lcu4;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcu4;->p()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return-object p0

    .line 13
    :cond_0
    invoke-virtual {p0}, Lsk2;->o0()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    iget-object p0, p0, Lsk2;->b:Lbu4;

    .line 18
    .line 19
    const-wide/16 v2, 0x0

    .line 20
    .line 21
    invoke-virtual {v0, v1, p0, v2, v3}, Lcu4;->m(ILbu4;J)Lbu4;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    iget-object p0, p0, Lbu4;->b:Lgn2;

    .line 26
    .line 27
    return-object p0
.end method

.method public final a0()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lsk2;->c1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lsk2;->d:Lrk2;

    .line 5
    .line 6
    invoke-interface {p0}, Lrk2;->Y()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const-string p0, "MediaController"

    .line 13
    .line 14
    const-string v0, "The controller is not connected. Ignoring unmute()."

    .line 15
    .line 16
    invoke-static {p0, v0}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    invoke-interface {p0}, Lrk2;->a0()V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final a1(Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lsk2;->f:Landroid/os/Handler;

    .line 2
    .line 3
    invoke-static {p0, p1}, Lf35;->W(Landroid/os/Handler;Ljava/lang/Runnable;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final b()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lsk2;->c1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lsk2;->d:Lrk2;

    .line 5
    .line 6
    invoke-interface {p0}, Lrk2;->Y()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const-string p0, "MediaController"

    .line 13
    .line 14
    const-string v0, "The controller is not connected. Ignoring prepare()."

    .line 15
    .line 16
    invoke-static {p0, v0}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    invoke-interface {p0}, Lrk2;->b()V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final b0()J
    .locals 2

    .line 1
    invoke-virtual {p0}, Lsk2;->c1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lsk2;->d:Lrk2;

    .line 5
    .line 6
    invoke-interface {p0}, Lrk2;->Y()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-interface {p0}, Lrk2;->b0()J

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    return-wide v0

    .line 17
    :cond_0
    const-wide/16 v0, 0x0

    .line 18
    .line 19
    return-wide v0
.end method

.method public final b1(Lva4;Landroid/os/Bundle;)Lic2;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lsk2;->c1()V

    .line 2
    .line 3
    .line 4
    iget v0, p1, Lva4;->a:I

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    const-string v1, "command must be a custom command"

    .line 12
    .line 13
    invoke-static {v1, v0}, Lrr2;->k(Ljava/lang/String;Z)V

    .line 14
    .line 15
    .line 16
    iget-object p0, p0, Lsk2;->d:Lrk2;

    .line 17
    .line 18
    invoke-interface {p0}, Lrk2;->Y()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    invoke-interface {p0, p1, p2}, Lrk2;->T0(Lva4;Landroid/os/Bundle;)Lic2;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0

    .line 29
    :cond_1
    new-instance p0, Lab4;

    .line 30
    .line 31
    const/16 p1, -0x64

    .line 32
    .line 33
    invoke-direct {p0, p1}, Lab4;-><init>(I)V

    .line 34
    .line 35
    .line 36
    new-instance p1, Lmw1;

    .line 37
    .line 38
    invoke-direct {p1, p0}, Lmw1;-><init>(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    return-object p1
.end method

.method public final c()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lsk2;->c1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lsk2;->d:Lrk2;

    .line 5
    .line 6
    invoke-interface {p0}, Lrk2;->Y()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const-string p0, "MediaController"

    .line 13
    .line 14
    const-string v0, "The controller is not connected. Ignoring pause()."

    .line 15
    .line 16
    invoke-static {p0, v0}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    invoke-interface {p0}, Lrk2;->c()V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final c0()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lsk2;->c1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lsk2;->d:Lrk2;

    .line 5
    .line 6
    invoke-interface {p0}, Lrk2;->Y()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const-string p0, "MediaController"

    .line 13
    .line 14
    const-string v0, "The controller is not connected. Ignoring seekToNextMediaItem()."

    .line 15
    .line 16
    invoke-static {p0, v0}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    invoke-interface {p0}, Lrk2;->c0()V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final c1()V
    .locals 1

    .line 1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object p0, p0, Lsk2;->f:Landroid/os/Handler;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    if-ne v0, p0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    :goto_0
    const-string v0, "MediaController method is called from a wrong thread. See javadoc of MediaController for details."

    .line 17
    .line 18
    invoke-static {v0, p0}, Lrr2;->v(Ljava/lang/String;Z)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final d(Lqh3;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lsk2;->c1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lsk2;->d:Lrk2;

    .line 5
    .line 6
    invoke-interface {p0}, Lrk2;->Y()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const-string p0, "MediaController"

    .line 13
    .line 14
    const-string p1, "The controller is not connected. Ignoring setPlaybackParameters()."

    .line 15
    .line 16
    invoke-static {p0, p1}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    invoke-interface {p0, p1}, Lrk2;->d(Lqh3;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final d0(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lsk2;->c1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lsk2;->d:Lrk2;

    .line 5
    .line 6
    invoke-interface {p0}, Lrk2;->Y()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const-string p0, "MediaController"

    .line 13
    .line 14
    const-string p1, "The controller is not connected. Ignoring decreaseDeviceVolume()."

    .line 15
    .line 16
    invoke-static {p0, p1}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    invoke-interface {p0, p1}, Lrk2;->d0(I)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final e(F)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lsk2;->c1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lsk2;->d:Lrk2;

    .line 5
    .line 6
    invoke-interface {p0}, Lrk2;->Y()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const-string p0, "MediaController"

    .line 13
    .line 14
    const-string p1, "The controller is not connected. Ignoring setPlaybackSpeed()."

    .line 15
    .line 16
    invoke-static {p0, p1}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    invoke-interface {p0, p1}, Lrk2;->e(F)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final e0()Ljw4;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lsk2;->c1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lsk2;->d:Lrk2;

    .line 5
    .line 6
    invoke-interface {p0}, Lrk2;->Y()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-interface {p0}, Lrk2;->e0()Ljw4;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0

    .line 17
    :cond_0
    sget-object p0, Ljw4;->b:Ljw4;

    .line 18
    .line 19
    return-object p0
.end method

.method public final f()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lsk2;->c1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lsk2;->d:Lrk2;

    .line 5
    .line 6
    invoke-interface {p0}, Lrk2;->Y()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-interface {p0}, Lrk2;->f()Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    const/4 p0, 0x1

    .line 19
    return p0

    .line 20
    :cond_0
    const/4 p0, 0x0

    .line 21
    return p0
.end method

.method public final f0()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lsk2;->c1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lsk2;->d:Lrk2;

    .line 5
    .line 6
    invoke-interface {p0}, Lrk2;->Y()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-interface {p0}, Lrk2;->f0()Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    const/4 p0, 0x1

    .line 19
    return p0

    .line 20
    :cond_0
    const/4 p0, 0x0

    .line 21
    return p0
.end method

.method public final g()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lsk2;->c1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lsk2;->d:Lrk2;

    .line 5
    .line 6
    invoke-interface {p0}, Lrk2;->Y()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-interface {p0}, Lrk2;->g()I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0

    .line 17
    :cond_0
    const/4 p0, 0x1

    .line 18
    return p0
.end method

.method public final g0()Ldo2;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lsk2;->c1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lsk2;->d:Lrk2;

    .line 5
    .line 6
    invoke-interface {p0}, Lrk2;->Y()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-interface {p0}, Lrk2;->g0()Ldo2;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0

    .line 17
    :cond_0
    sget-object p0, Ldo2;->K:Ldo2;

    .line 18
    .line 19
    return-object p0
.end method

.method public final getDuration()J
    .locals 2

    .line 1
    invoke-virtual {p0}, Lsk2;->c1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lsk2;->d:Lrk2;

    .line 5
    .line 6
    invoke-interface {p0}, Lrk2;->Y()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-interface {p0}, Lrk2;->getDuration()J

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    return-wide v0

    .line 17
    :cond_0
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    return-wide v0
.end method

.method public final h()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lsk2;->c1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lsk2;->d:Lrk2;

    .line 5
    .line 6
    invoke-interface {p0}, Lrk2;->Y()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-interface {p0}, Lrk2;->h()I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0

    .line 17
    :cond_0
    const/4 p0, 0x0

    .line 18
    return p0
.end method

.method public final h0()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lsk2;->c1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lsk2;->d:Lrk2;

    .line 5
    .line 6
    invoke-interface {p0}, Lrk2;->Y()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-interface {p0}, Lrk2;->h0()Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    const/4 p0, 0x1

    .line 19
    return p0

    .line 20
    :cond_0
    const/4 p0, 0x0

    .line 21
    return p0
.end method

.method public final i()Lqh3;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lsk2;->c1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lsk2;->d:Lrk2;

    .line 5
    .line 6
    invoke-interface {p0}, Lrk2;->Y()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-interface {p0}, Lrk2;->i()Lqh3;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0

    .line 17
    :cond_0
    sget-object p0, Lqh3;->d:Lqh3;

    .line 18
    .line 19
    return-object p0
.end method

.method public final i0()Ljg0;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lsk2;->c1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lsk2;->d:Lrk2;

    .line 5
    .line 6
    invoke-interface {p0}, Lrk2;->Y()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-interface {p0}, Lrk2;->i0()Ljg0;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0

    .line 17
    :cond_0
    sget-object p0, Ljg0;->d:Ljg0;

    .line 18
    .line 19
    return-object p0
.end method

.method public final j()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lsk2;->c1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lsk2;->d:Lrk2;

    .line 5
    .line 6
    invoke-interface {p0}, Lrk2;->Y()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const/4 p0, 0x0

    .line 13
    return p0

    .line 14
    :cond_0
    invoke-interface {p0}, Lrk2;->j()I

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    return p0
.end method

.method public final j0()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lsk2;->c1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lsk2;->d:Lrk2;

    .line 5
    .line 6
    invoke-interface {p0}, Lrk2;->Y()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-interface {p0}, Lrk2;->j0()I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0

    .line 17
    :cond_0
    const/4 p0, -0x1

    .line 18
    return p0
.end method

.method public final k()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lsk2;->c1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lsk2;->d:Lrk2;

    .line 5
    .line 6
    invoke-interface {p0}, Lrk2;->Y()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-interface {p0}, Lrk2;->k()Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    const/4 p0, 0x1

    .line 19
    return p0

    .line 20
    :cond_0
    const/4 p0, 0x0

    .line 21
    return p0
.end method

.method public final k0(Lil;Z)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lsk2;->c1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lsk2;->d:Lrk2;

    .line 5
    .line 6
    invoke-interface {p0}, Lrk2;->Y()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const-string p0, "MediaController"

    .line 13
    .line 14
    const-string p1, "The controller is not connected. Ignoring setAudioAttributes()."

    .line 15
    .line 16
    invoke-static {p0, p1}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    invoke-interface {p0, p1, p2}, Lrk2;->k0(Lil;Z)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final l()J
    .locals 2

    .line 1
    invoke-virtual {p0}, Lsk2;->c1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lsk2;->d:Lrk2;

    .line 5
    .line 6
    invoke-interface {p0}, Lrk2;->Y()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-interface {p0}, Lrk2;->l()J

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    return-wide v0

    .line 17
    :cond_0
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    return-wide v0
.end method

.method public final l0(Ldo2;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lsk2;->c1()V

    .line 2
    .line 3
    .line 4
    const-string v0, "playlistMetadata must not be null"

    .line 5
    .line 6
    invoke-static {p1, v0}, Lrr2;->s(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, Lsk2;->d:Lrk2;

    .line 10
    .line 11
    invoke-interface {p0}, Lrk2;->Y()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    const-string p0, "MediaController"

    .line 18
    .line 19
    const-string p1, "The controller is not connected. Ignoring setPlaylistMetadata()."

    .line 20
    .line 21
    invoke-static {p0, p1}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    invoke-interface {p0, p1}, Lrk2;->l0(Ldo2;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final m()J
    .locals 2

    .line 1
    invoke-virtual {p0}, Lsk2;->c1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lsk2;->d:Lrk2;

    .line 5
    .line 6
    invoke-interface {p0}, Lrk2;->Y()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-interface {p0}, Lrk2;->m()J

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    return-wide v0

    .line 17
    :cond_0
    const-wide/16 v0, 0x0

    .line 18
    .line 19
    return-wide v0
.end method

.method public final m0()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lsk2;->c1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lsk2;->d:Lrk2;

    .line 5
    .line 6
    invoke-interface {p0}, Lrk2;->Y()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const-string p0, "MediaController"

    .line 13
    .line 14
    const-string v0, "The controller is not connected. Ignoring play()."

    .line 15
    .line 16
    invoke-static {p0, v0}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    invoke-interface {p0}, Lrk2;->m0()V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final n(IJ)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lsk2;->c1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lsk2;->d:Lrk2;

    .line 5
    .line 6
    invoke-interface {p0}, Lrk2;->Y()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const-string p0, "MediaController"

    .line 13
    .line 14
    const-string p1, "The controller is not connected. Ignoring seekTo()."

    .line 15
    .line 16
    invoke-static {p0, p1}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    invoke-interface {p0, p1, p2, p3}, Lrk2;->n(IJ)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final n0()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lsk2;->c1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lsk2;->d:Lrk2;

    .line 5
    .line 6
    invoke-interface {p0}, Lrk2;->Y()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-interface {p0}, Lrk2;->n0()I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0

    .line 17
    :cond_0
    const/4 p0, -0x1

    .line 18
    return p0
.end method

.method public final o()Lmi3;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lsk2;->c1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lsk2;->d:Lrk2;

    .line 5
    .line 6
    invoke-interface {p0}, Lrk2;->Y()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    sget-object p0, Lmi3;->b:Lmi3;

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_0
    invoke-interface {p0}, Lrk2;->o()Lmi3;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method

.method public final o0()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lsk2;->c1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lsk2;->d:Lrk2;

    .line 5
    .line 6
    invoke-interface {p0}, Lrk2;->Y()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-interface {p0}, Lrk2;->o0()I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0

    .line 17
    :cond_0
    const/4 p0, -0x1

    .line 18
    return p0
.end method

.method public final p(Lgn2;J)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lsk2;->c1()V

    .line 2
    .line 3
    .line 4
    const-string v0, "mediaItems must not be null"

    .line 5
    .line 6
    invoke-static {p1, v0}, Lrr2;->s(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, Lsk2;->d:Lrk2;

    .line 10
    .line 11
    invoke-interface {p0}, Lrk2;->Y()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    const-string p0, "MediaController"

    .line 18
    .line 19
    const-string p1, "The controller is not connected. Ignoring setMediaItem()."

    .line 20
    .line 21
    invoke-static {p0, p1}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    invoke-interface {p0, p1, p2, p3}, Lrk2;->p(Lgn2;J)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final p0(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lsk2;->c1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lsk2;->d:Lrk2;

    .line 5
    .line 6
    invoke-interface {p0}, Lrk2;->Y()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const-string p0, "MediaController"

    .line 13
    .line 14
    const-string p1, "The controller is not connected. Ignoring setRepeatMode()."

    .line 15
    .line 16
    invoke-static {p0, p1}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    invoke-interface {p0, p1}, Lrk2;->p0(I)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final q()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lsk2;->c1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lsk2;->d:Lrk2;

    .line 5
    .line 6
    invoke-interface {p0}, Lrk2;->Y()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-interface {p0}, Lrk2;->q()Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    const/4 p0, 0x1

    .line 19
    return p0

    .line 20
    :cond_0
    const/4 p0, 0x0

    .line 21
    return p0
.end method

.method public final q0(Z)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lsk2;->c1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lsk2;->d:Lrk2;

    .line 5
    .line 6
    invoke-interface {p0}, Lrk2;->Y()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const-string p0, "MediaController"

    .line 13
    .line 14
    const-string p1, "The controller is not connected. Ignoring setDeviceMuted()."

    .line 15
    .line 16
    invoke-static {p0, p1}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    invoke-interface {p0, p1}, Lrk2;->q0(Z)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final r()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lsk2;->c1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lsk2;->d:Lrk2;

    .line 5
    .line 6
    invoke-interface {p0}, Lrk2;->Y()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const-string p0, "MediaController"

    .line 13
    .line 14
    const-string v0, "The controller is not connected. Ignoring clearMediaItems()."

    .line 15
    .line 16
    invoke-static {p0, v0}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    invoke-interface {p0}, Lrk2;->r()V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final r0(Loi3;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lsk2;->c1()V

    .line 2
    .line 3
    .line 4
    const-string v0, "listener must not be null"

    .line 5
    .line 6
    invoke-static {p1, v0}, Lrr2;->s(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, Lsk2;->d:Lrk2;

    .line 10
    .line 11
    invoke-interface {p0, p1}, Lrk2;->r0(Loi3;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final s(Z)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lsk2;->c1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lsk2;->d:Lrk2;

    .line 5
    .line 6
    invoke-interface {p0}, Lrk2;->Y()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const-string p0, "MediaController"

    .line 13
    .line 14
    const-string p1, "The controller is not connected. Ignoring setShuffleMode()."

    .line 15
    .line 16
    invoke-static {p0, p1}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    invoke-interface {p0, p1}, Lrk2;->s(Z)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final s0(Lgn2;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lsk2;->c1()V

    .line 2
    .line 3
    .line 4
    const-string v0, "mediaItems must not be null"

    .line 5
    .line 6
    invoke-static {p1, v0}, Lrr2;->s(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, Lsk2;->d:Lrk2;

    .line 10
    .line 11
    invoke-interface {p0}, Lrk2;->Y()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    const-string p0, "MediaController"

    .line 18
    .line 19
    const-string p1, "The controller is not connected. Ignoring setMediaItem()."

    .line 20
    .line 21
    invoke-static {p0, p1}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    invoke-interface {p0, p1}, Lrk2;->s0(Lgn2;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final stop()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lsk2;->c1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lsk2;->d:Lrk2;

    .line 5
    .line 6
    invoke-interface {p0}, Lrk2;->Y()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const-string p0, "MediaController"

    .line 13
    .line 14
    const-string v0, "The controller is not connected. Ignoring stop()."

    .line 15
    .line 16
    invoke-static {p0, v0}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    invoke-interface {p0}, Lrk2;->stop()V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final t()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lsk2;->c1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lsk2;->d:Lrk2;

    .line 5
    .line 6
    invoke-interface {p0}, Lrk2;->Y()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-interface {p0}, Lrk2;->t()I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0

    .line 17
    :cond_0
    const/4 p0, 0x0

    .line 18
    return p0
.end method

.method public final t0(II)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lsk2;->c1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lsk2;->d:Lrk2;

    .line 5
    .line 6
    invoke-interface {p0}, Lrk2;->Y()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const-string p0, "MediaController"

    .line 13
    .line 14
    const-string p1, "The controller is not connected. Ignoring moveMediaItem()."

    .line 15
    .line 16
    invoke-static {p0, p1}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    invoke-interface {p0, p1, p2}, Lrk2;->t0(II)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final u()J
    .locals 2

    .line 1
    invoke-virtual {p0}, Lsk2;->c1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lsk2;->d:Lrk2;

    .line 5
    .line 6
    invoke-interface {p0}, Lrk2;->Y()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-interface {p0}, Lrk2;->u()J

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    return-wide v0

    .line 17
    :cond_0
    const-wide/16 v0, 0x0

    .line 18
    .line 19
    return-wide v0
.end method

.method public final u0(III)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lsk2;->c1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lsk2;->d:Lrk2;

    .line 5
    .line 6
    invoke-interface {p0}, Lrk2;->Y()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const-string p0, "MediaController"

    .line 13
    .line 14
    const-string p1, "The controller is not connected. Ignoring moveMediaItems()."

    .line 15
    .line 16
    invoke-static {p0, p1}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    invoke-interface {p0, p1, p2, p3}, Lrk2;->u0(III)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final v(Loi3;)V
    .locals 1

    .line 1
    const-string v0, "listener must not be null"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lrr2;->s(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lsk2;->d:Lrk2;

    .line 7
    .line 8
    invoke-interface {p0, p1}, Lrk2;->v(Loi3;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final v0()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lsk2;->c1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lsk2;->d:Lrk2;

    .line 5
    .line 6
    invoke-interface {p0}, Lrk2;->Y()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-interface {p0}, Lrk2;->v0()I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0

    .line 17
    :cond_0
    const/4 p0, 0x0

    .line 18
    return p0
.end method

.method public final w()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lsk2;->c1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lsk2;->d:Lrk2;

    .line 5
    .line 6
    invoke-interface {p0}, Lrk2;->Y()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-interface {p0}, Lrk2;->w()I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0

    .line 17
    :cond_0
    const/4 p0, -0x1

    .line 18
    return p0
.end method

.method public final w0(Ljava/util/List;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lsk2;->c1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lsk2;->d:Lrk2;

    .line 5
    .line 6
    invoke-interface {p0}, Lrk2;->Y()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const-string p0, "MediaController"

    .line 13
    .line 14
    const-string p1, "The controller is not connected. Ignoring addMediaItems()."

    .line 15
    .line 16
    invoke-static {p0, p1}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    invoke-interface {p0, p1}, Lrk2;->w0(Ljava/util/List;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final x()J
    .locals 2

    .line 1
    invoke-virtual {p0}, Lsk2;->c1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lsk2;->d:Lrk2;

    .line 5
    .line 6
    invoke-interface {p0}, Lrk2;->Y()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-interface {p0}, Lrk2;->x()J

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    return-wide v0

    .line 17
    :cond_0
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    return-wide v0
.end method

.method public final x0()Lcu4;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lsk2;->c1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lsk2;->d:Lrk2;

    .line 5
    .line 6
    invoke-interface {p0}, Lrk2;->Y()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-interface {p0}, Lrk2;->x0()Lcu4;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0

    .line 17
    :cond_0
    sget-object p0, Lcu4;->a:Lyt4;

    .line 18
    .line 19
    return-object p0
.end method

.method public final y()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lsk2;->c1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lsk2;->d:Lrk2;

    .line 5
    .line 6
    invoke-interface {p0}, Lrk2;->Y()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-interface {p0}, Lrk2;->y()I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0

    .line 17
    :cond_0
    const/4 p0, -0x1

    .line 18
    return p0
.end method

.method public final y0()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lsk2;->c1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lsk2;->d:Lrk2;

    .line 5
    .line 6
    invoke-interface {p0}, Lrk2;->Y()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const/4 p0, 0x0

    .line 13
    return p0

    .line 14
    :cond_0
    invoke-interface {p0}, Lrk2;->y0()Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    return p0
.end method

.method public final z()Ls55;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lsk2;->c1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lsk2;->d:Lrk2;

    .line 5
    .line 6
    invoke-interface {p0}, Lrk2;->Y()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-interface {p0}, Lrk2;->z()Ls55;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0

    .line 17
    :cond_0
    sget-object p0, Ls55;->d:Ls55;

    .line 18
    .line 19
    return-object p0
.end method

.method public final z0(ILgn2;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lsk2;->c1()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lsk2;->d:Lrk2;

    .line 5
    .line 6
    invoke-interface {p0}, Lrk2;->Y()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const-string p0, "MediaController"

    .line 13
    .line 14
    const-string p1, "The controller is not connected. Ignoring replaceMediaItem()."

    .line 15
    .line 16
    invoke-static {p0, p1}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    invoke-interface {p0, p1, p2}, Lrk2;->z0(ILgn2;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method
