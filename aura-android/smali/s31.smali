.class public final synthetic Ls31;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lqc2;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lph3;


# direct methods
.method public synthetic constructor <init>(Lph3;I)V
    .locals 0

    .line 1
    iput p2, p0, Ls31;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Ls31;->o:Lph3;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget v0, p0, Ls31;->n:I

    .line 2
    .line 3
    iget-object p0, p0, Ls31;->o:Lph3;

    .line 4
    .line 5
    check-cast p1, Loi3;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Lph3;->i:Lew4;

    .line 11
    .line 12
    iget-object p0, p0, Lew4;->r:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, Ljw4;

    .line 15
    .line 16
    invoke-interface {p1, p0}, Loi3;->A(Ljw4;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_0
    iget-object p0, p0, Lph3;->f:Landroidx/media3/exoplayer/ExoPlaybackException;

    .line 21
    .line 22
    invoke-interface {p1, p0}, Loi3;->S(Landroidx/media3/common/PlaybackException;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :pswitch_1
    iget-object p0, p0, Lph3;->f:Landroidx/media3/exoplayer/ExoPlaybackException;

    .line 27
    .line 28
    invoke-interface {p1, p0}, Loi3;->P(Landroidx/media3/common/PlaybackException;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :pswitch_2
    iget-object p0, p0, Lph3;->o:Lqh3;

    .line 33
    .line 34
    invoke-interface {p1, p0}, Loi3;->N(Lqh3;)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :pswitch_3
    invoke-virtual {p0}, Lph3;->m()Z

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    invoke-interface {p1, p0}, Loi3;->V(Z)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :pswitch_4
    iget p0, p0, Lph3;->n:I

    .line 47
    .line 48
    invoke-interface {p1, p0}, Loi3;->g(I)V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :pswitch_5
    iget-boolean v0, p0, Lph3;->l:Z

    .line 53
    .line 54
    iget p0, p0, Lph3;->m:I

    .line 55
    .line 56
    invoke-interface {p1, p0, v0}, Loi3;->r(IZ)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :pswitch_6
    iget p0, p0, Lph3;->e:I

    .line 61
    .line 62
    invoke-interface {p1, p0}, Loi3;->v(I)V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :pswitch_7
    iget-boolean v0, p0, Lph3;->l:Z

    .line 67
    .line 68
    iget p0, p0, Lph3;->e:I

    .line 69
    .line 70
    invoke-interface {p1, p0, v0}, Loi3;->L(IZ)V

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    :pswitch_8
    iget-boolean v0, p0, Lph3;->g:Z

    .line 75
    .line 76
    invoke-interface {p1, v0}, Loi3;->i(Z)V

    .line 77
    .line 78
    .line 79
    iget-boolean p0, p0, Lph3;->g:Z

    .line 80
    .line 81
    invoke-interface {p1, p0}, Loi3;->q(Z)V

    .line 82
    .line 83
    .line 84
    return-void

    .line 85
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
