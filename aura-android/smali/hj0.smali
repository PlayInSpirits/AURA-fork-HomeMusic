.class public final synthetic Lhj0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lqc2;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Landroidx/media3/common/PlaybackException;


# direct methods
.method public synthetic constructor <init>(ILandroidx/media3/common/PlaybackException;)V
    .locals 0

    .line 10
    iput p1, p0, Lhj0;->n:I

    iput-object p2, p0, Lhj0;->o:Landroidx/media3/common/PlaybackException;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lq9;Landroidx/media3/common/PlaybackException;)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    iput p1, p0, Lhj0;->n:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, Lhj0;->o:Landroidx/media3/common/PlaybackException;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget v0, p0, Lhj0;->n:I

    .line 2
    .line 3
    iget-object p0, p0, Lhj0;->o:Landroidx/media3/common/PlaybackException;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Loi3;

    .line 9
    .line 10
    invoke-interface {p1, p0}, Loi3;->S(Landroidx/media3/common/PlaybackException;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    check-cast p1, Loi3;

    .line 15
    .line 16
    invoke-interface {p1, p0}, Loi3;->P(Landroidx/media3/common/PlaybackException;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_1
    check-cast p1, Loi3;

    .line 21
    .line 22
    invoke-interface {p1, p0}, Loi3;->S(Landroidx/media3/common/PlaybackException;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :pswitch_2
    check-cast p1, Loi3;

    .line 27
    .line 28
    invoke-interface {p1, p0}, Loi3;->P(Landroidx/media3/common/PlaybackException;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :pswitch_3
    check-cast p1, Lho2;

    .line 33
    .line 34
    iput-object p0, p1, Lho2;->o:Landroidx/media3/common/PlaybackException;

    .line 35
    .line 36
    return-void

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
