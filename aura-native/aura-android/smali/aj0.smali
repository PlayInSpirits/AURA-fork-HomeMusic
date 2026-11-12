.class public final Laj0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lrm;


# instance fields
.field public final synthetic n:Landroidx/media3/decoder/ffmpeg/b;


# direct methods
.method public constructor <init>(Landroidx/media3/decoder/ffmpeg/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Laj0;->n:Landroidx/media3/decoder/ffmpeg/b;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(J)V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    iget-object p0, p0, Laj0;->n:Landroidx/media3/decoder/ffmpeg/b;

    .line 3
    .line 4
    iput-boolean v0, p0, Landroidx/media3/decoder/ffmpeg/b;->d0:Z

    .line 5
    .line 6
    iget-object p0, p0, Landroidx/media3/decoder/ffmpeg/b;->F:Lxc5;

    .line 7
    .line 8
    iget-object v0, p0, Lxc5;->o:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Landroid/os/Handler;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    new-instance v1, Lmm;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-direct {v1, p0, p1, p2, v2}, Lmm;-><init>(Ljava/lang/Object;JI)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
.end method

.method public final b(I)V
    .locals 3

    .line 1
    iget-object p0, p0, Laj0;->n:Landroidx/media3/decoder/ffmpeg/b;

    .line 2
    .line 3
    iget-object p0, p0, Landroidx/media3/decoder/ffmpeg/b;->F:Lxc5;

    .line 4
    .line 5
    iget-object v0, p0, Lxc5;->o:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Landroid/os/Handler;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    new-instance v1, Lul;

    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    invoke-direct {v1, p1, v2, p0}, Lul;-><init>(IILjava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public final d(Z)V
    .locals 3

    .line 1
    iget-object p0, p0, Laj0;->n:Landroidx/media3/decoder/ffmpeg/b;

    .line 2
    .line 3
    iget-object p0, p0, Landroidx/media3/decoder/ffmpeg/b;->F:Lxc5;

    .line 4
    .line 5
    iget-object v0, p0, Lxc5;->o:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Landroid/os/Handler;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    new-instance v1, Lpm;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-direct {v1, p0, p1, v2}, Lpm;-><init>(Ljava/lang/Object;ZI)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public final f(Lpa;)V
    .locals 3

    .line 1
    iget-object p0, p0, Laj0;->n:Landroidx/media3/decoder/ffmpeg/b;

    .line 2
    .line 3
    iget-object p0, p0, Landroidx/media3/decoder/ffmpeg/b;->F:Lxc5;

    .line 4
    .line 5
    iget-object v0, p0, Lxc5;->o:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Landroid/os/Handler;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    new-instance v1, Lnm;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-direct {v1, p0, p1, v2}, Lnm;-><init>(Lxc5;Lpa;I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public final g(Ljava/lang/Exception;)V
    .locals 3

    .line 1
    const-string v0, "DecoderAudioRenderer"

    .line 2
    .line 3
    const-string v1, "Audio sink error"

    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Ll93;->G(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Laj0;->n:Landroidx/media3/decoder/ffmpeg/b;

    .line 9
    .line 10
    iget-object p0, p0, Landroidx/media3/decoder/ffmpeg/b;->F:Lxc5;

    .line 11
    .line 12
    iget-object v0, p0, Lxc5;->o:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Landroid/os/Handler;

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    new-instance v1, Ljm;

    .line 19
    .line 20
    const/4 v2, 0x1

    .line 21
    invoke-direct {v1, p0, p1, v2}, Ljm;-><init>(Lxc5;Ljava/lang/Exception;I)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void
.end method

.method public final j(Lpa;)V
    .locals 3

    .line 1
    iget-object p0, p0, Laj0;->n:Landroidx/media3/decoder/ffmpeg/b;

    .line 2
    .line 3
    iget-object p0, p0, Landroidx/media3/decoder/ffmpeg/b;->F:Lxc5;

    .line 4
    .line 5
    iget-object v0, p0, Lxc5;->o:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Landroid/os/Handler;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    new-instance v1, Lnm;

    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    invoke-direct {v1, p0, p1, v2}, Lnm;-><init>(Lxc5;Lpa;I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public final n()V
    .locals 1

    .line 1
    iget-object p0, p0, Laj0;->n:Landroidx/media3/decoder/ffmpeg/b;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    iput-boolean v0, p0, Landroidx/media3/decoder/ffmpeg/b;->c0:Z

    .line 5
    .line 6
    return-void
.end method

.method public final q(IJJ)V
    .locals 8

    .line 1
    iget-object p0, p0, Laj0;->n:Landroidx/media3/decoder/ffmpeg/b;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/media3/decoder/ffmpeg/b;->F:Lxc5;

    .line 4
    .line 5
    iget-object p0, v1, Lxc5;->o:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Landroid/os/Handler;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    new-instance v0, Llm;

    .line 12
    .line 13
    const/4 v7, 0x0

    .line 14
    move v2, p1

    .line 15
    move-wide v3, p2

    .line 16
    move-wide v5, p4

    .line 17
    invoke-direct/range {v0 .. v7}, Llm;-><init>(Ljava/lang/Object;IJJI)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
.end method

.method public final s()V
    .locals 0

    .line 1
    iget-object p0, p0, Laj0;->n:Landroidx/media3/decoder/ffmpeg/b;

    .line 2
    .line 3
    invoke-virtual {p0}, Lkq;->t()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final u()V
    .locals 1

    .line 1
    iget-object p0, p0, Laj0;->n:Landroidx/media3/decoder/ffmpeg/b;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    iput-boolean v0, p0, Landroidx/media3/decoder/ffmpeg/b;->W:Z

    .line 5
    .line 6
    return-void
.end method
