.class public final Lgm2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/os/IBinder$DeathRecipient;


# instance fields
.field public final a:Luk2;

.field public b:Lgk0;

.field public c:Ltk2;

.field public final d:Landroid/os/Handler;

.field public final synthetic e:Lim2;


# direct methods
.method public constructor <init>(Lim2;Landroid/os/Looper;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lgm2;->e:Lim2;

    .line 5
    .line 6
    new-instance p1, Luk2;

    .line 7
    .line 8
    invoke-direct {p1, p0}, Luk2;-><init>(Lgm2;)V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lgm2;->a:Luk2;

    .line 12
    .line 13
    new-instance p1, Landroid/os/Handler;

    .line 14
    .line 15
    new-instance v0, Lgt0;

    .line 16
    .line 17
    const/4 v1, 0x3

    .line 18
    invoke-direct {v0, v1, p0}, Lgt0;-><init>(ILjava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p1, p2, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Lgm2;->d:Landroid/os/Handler;

    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public final a(Z)V
    .locals 2

    .line 1
    iget-object p0, p0, Lgm2;->e:Lim2;

    .line 2
    .line 3
    invoke-virtual {p0}, Lim2;->a1()Lsk2;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v1, p0, Lsk2;->f:Landroid/os/Handler;

    .line 15
    .line 16
    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    if-ne v0, v1, :cond_0

    .line 21
    .line 22
    const/4 v0, 0x1

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 v0, 0x0

    .line 25
    :goto_0
    invoke-static {v0}, Lrr2;->w(Z)V

    .line 26
    .line 27
    .line 28
    iget-object p0, p0, Lsk2;->e:Lqk2;

    .line 29
    .line 30
    new-instance v0, Landroid/os/Bundle;

    .line 31
    .line 32
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 33
    .line 34
    .line 35
    const-string v1, "androidx.media3.session.ARGUMENT_CAPTIONING_ENABLED"

    .line 36
    .line 37
    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 38
    .line 39
    .line 40
    new-instance p1, Lva4;

    .line 41
    .line 42
    const-string v0, "androidx.media3.session.SESSION_COMMAND_ON_CAPTIONING_ENABLED_CHANGED"

    .line 43
    .line 44
    sget-object v1, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 45
    .line 46
    invoke-direct {p1, v0, v1}, Lva4;-><init>(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 47
    .line 48
    .line 49
    invoke-interface {p0, p1}, Lqk2;->y(Lva4;)Lmw1;

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public final b(Lei3;)V
    .locals 11

    .line 1
    iget-object v0, p0, Lgm2;->e:Lim2;

    .line 2
    .line 3
    iget-object v1, v0, Lim2;->n:Lhm2;

    .line 4
    .line 5
    invoke-static {p1}, Lim2;->Y0(Lei3;)Lei3;

    .line 6
    .line 7
    .line 8
    move-result-object v4

    .line 9
    new-instance v2, Lhm2;

    .line 10
    .line 11
    iget-object p1, v1, Lhm2;->d:Ljava/lang/Object;

    .line 12
    .line 13
    move-object v3, p1

    .line 14
    check-cast v3, Lfg4;

    .line 15
    .line 16
    iget-object p1, v1, Lhm2;->f:Ljava/lang/Object;

    .line 17
    .line 18
    move-object v5, p1

    .line 19
    check-cast v5, Leo2;

    .line 20
    .line 21
    iget-object v6, v1, Lhm2;->a:Ljava/util/List;

    .line 22
    .line 23
    iget-object p1, v1, Lhm2;->g:Ljava/lang/Object;

    .line 24
    .line 25
    move-object v7, p1

    .line 26
    check-cast v7, Ljava/lang/CharSequence;

    .line 27
    .line 28
    iget v8, v1, Lhm2;->b:I

    .line 29
    .line 30
    iget v9, v1, Lhm2;->c:I

    .line 31
    .line 32
    iget-object p1, v1, Lhm2;->h:Ljava/lang/Object;

    .line 33
    .line 34
    move-object v10, p1

    .line 35
    check-cast v10, Landroid/os/Bundle;

    .line 36
    .line 37
    invoke-direct/range {v2 .. v10}, Lhm2;-><init>(Lfg4;Lei3;Leo2;Ljava/util/List;Ljava/lang/CharSequence;IILandroid/os/Bundle;)V

    .line 38
    .line 39
    .line 40
    iput-object v2, v0, Lim2;->n:Lhm2;

    .line 41
    .line 42
    invoke-virtual {p0}, Lgm2;->e()V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public final binderDied()V
    .locals 2

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p0, v0, v1}, Lgm2;->c(ILjava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final c(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lgm2;->b:Lgk0;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Landroid/os/Message;->sendToTarget()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final d(Landroid/os/Handler;)V
    .locals 1

    .line 1
    if-nez p1, :cond_1

    .line 2
    .line 3
    iget-object p1, p0, Lgm2;->b:Lgk0;

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput-boolean v0, p1, Lgk0;->b:Z

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lgm2;->b:Lgk0;

    .line 15
    .line 16
    :cond_0
    return-void

    .line 17
    :cond_1
    new-instance v0, Lgk0;

    .line 18
    .line 19
    invoke-virtual {p1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-direct {v0, p0, p1}, Lgk0;-><init>(Lgm2;Landroid/os/Looper;)V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, Lgm2;->b:Lgk0;

    .line 27
    .line 28
    const/4 p0, 0x1

    .line 29
    iput-boolean p0, v0, Lgk0;->b:Z

    .line 30
    .line 31
    return-void
.end method

.method public final e()V
    .locals 4

    .line 1
    iget-object v0, p0, Lgm2;->d:Landroid/os/Handler;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Landroid/os/Handler;->hasMessages(I)Z

    .line 5
    .line 6
    .line 7
    move-result v2

    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    iget-object p0, p0, Lgm2;->e:Lim2;

    .line 12
    .line 13
    iget-wide v2, p0, Lim2;->h:J

    .line 14
    .line 15
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 16
    .line 17
    .line 18
    return-void
.end method
