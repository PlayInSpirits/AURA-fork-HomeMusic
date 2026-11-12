.class public final Lq85;
.super Landroid/media/VolumeProvider;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final synthetic a:Lis2;


# direct methods
.method public constructor <init>(Lis2;IIILjava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lq85;->a:Lis2;

    .line 2
    .line 3
    invoke-direct {p0, p2, p3, p4, p5}, Landroid/media/VolumeProvider;-><init>(IIILjava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onAdjustVolume(I)V
    .locals 3

    .line 1
    iget-object p0, p0, Lq85;->a:Lis2;

    .line 2
    .line 3
    iget-object v0, p0, Lis2;->f:Landroid/os/Handler;

    .line 4
    .line 5
    iget-object p0, p0, Lis2;->g:Lal3;

    .line 6
    .line 7
    new-instance v1, Lhs2;

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    invoke-direct {v1, p0, p1, v2}, Lhs2;-><init>(Lal3;II)V

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1}, Lf35;->W(Landroid/os/Handler;Ljava/lang/Runnable;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final onSetVolumeTo(I)V
    .locals 3

    .line 1
    iget-object p0, p0, Lq85;->a:Lis2;

    .line 2
    .line 3
    iget-object v0, p0, Lis2;->f:Landroid/os/Handler;

    .line 4
    .line 5
    iget-object p0, p0, Lis2;->g:Lal3;

    .line 6
    .line 7
    new-instance v1, Lhs2;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-direct {v1, p0, p1, v2}, Lhs2;-><init>(Lal3;II)V

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1}, Lf35;->W(Landroid/os/Handler;Ljava/lang/Runnable;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
