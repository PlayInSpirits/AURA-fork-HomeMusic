.class public final Lx52;
.super Landroid/media/VolumeProvider;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/media/session/MediaSession;II)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lx52;->a:I

    .line 3
    .line 4
    iput-object p1, p0, Lx52;->b:Ljava/lang/Object;

    .line 5
    .line 6
    const/4 p1, 0x2

    .line 7
    invoke-direct {p0, p1, p2, p3}, Landroid/media/VolumeProvider;-><init>(III)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Lis2;III)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lx52;->a:I

    .line 11
    iput-object p1, p0, Lx52;->b:Ljava/lang/Object;

    invoke-direct {p0, p2, p3, p4}, Landroid/media/VolumeProvider;-><init>(III)V

    return-void
.end method


# virtual methods
.method public final onAdjustVolume(I)V
    .locals 4

    .line 1
    iget v0, p0, Lx52;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lx52;->b:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast v1, Lis2;

    .line 9
    .line 10
    iget-object p0, v1, Lis2;->f:Landroid/os/Handler;

    .line 11
    .line 12
    iget-object v0, v1, Lis2;->g:Lal3;

    .line 13
    .line 14
    new-instance v1, Lhs2;

    .line 15
    .line 16
    const/4 v2, 0x1

    .line 17
    invoke-direct {v1, v0, p1, v2}, Lhs2;-><init>(Lal3;II)V

    .line 18
    .line 19
    .line 20
    invoke-static {p0, v1}, Lf35;->W(Landroid/os/Handler;Ljava/lang/Runnable;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :pswitch_0
    sget-object v0, Lz52;->c:Landroid/os/Handler;

    .line 25
    .line 26
    check-cast v1, Landroid/media/session/MediaSession;

    .line 27
    .line 28
    new-instance v2, Lw52;

    .line 29
    .line 30
    const/4 v3, 0x0

    .line 31
    invoke-direct {v2, p0, v1, p1, v3}, Lw52;-><init>(Lx52;Landroid/media/session/MediaSession;II)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onSetVolumeTo(I)V
    .locals 4

    .line 1
    iget v0, p0, Lx52;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lx52;->b:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast v1, Lis2;

    .line 9
    .line 10
    iget-object p0, v1, Lis2;->f:Landroid/os/Handler;

    .line 11
    .line 12
    iget-object v0, v1, Lis2;->g:Lal3;

    .line 13
    .line 14
    new-instance v1, Lhs2;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-direct {v1, v0, p1, v2}, Lhs2;-><init>(Lal3;II)V

    .line 18
    .line 19
    .line 20
    invoke-static {p0, v1}, Lf35;->W(Landroid/os/Handler;Ljava/lang/Runnable;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :pswitch_0
    sget-object v0, Lz52;->c:Landroid/os/Handler;

    .line 25
    .line 26
    check-cast v1, Landroid/media/session/MediaSession;

    .line 27
    .line 28
    new-instance v2, Lw52;

    .line 29
    .line 30
    const/4 v3, 0x1

    .line 31
    invoke-direct {v2, p0, v1, p1, v3}, Lw52;-><init>(Lx52;Landroid/media/session/MediaSession;II)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
