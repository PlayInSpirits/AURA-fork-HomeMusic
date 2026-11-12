.class public final Lzm;
.super Landroid/media/AudioTrack$StreamEventCallback;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final synthetic a:Ljv3;


# direct methods
.method public constructor <init>(Ljv3;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lzm;->a:Ljv3;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/media/AudioTrack$StreamEventCallback;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onDataRequest(Landroid/media/AudioTrack;I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lzm;->a:Ljv3;

    .line 2
    .line 3
    iget-object p0, p0, Ljv3;->p:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Lan;

    .line 6
    .line 7
    iget-object p0, p0, Lan;->i:Ltc2;

    .line 8
    .line 9
    new-instance p1, Lkf2;

    .line 10
    .line 11
    const/4 p2, 0x7

    .line 12
    invoke-direct {p1, p2}, Lkf2;-><init>(I)V

    .line 13
    .line 14
    .line 15
    const/4 p2, -0x1

    .line 16
    invoke-virtual {p0, p2, p1}, Ltc2;->f(ILqc2;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final onPresentationEnded(Landroid/media/AudioTrack;)V
    .locals 1

    .line 1
    iget-object p0, p0, Lzm;->a:Ljv3;

    .line 2
    .line 3
    iget-object p0, p0, Ljv3;->p:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Lan;

    .line 6
    .line 7
    iget-object p0, p0, Lan;->i:Ltc2;

    .line 8
    .line 9
    new-instance p1, Lkf2;

    .line 10
    .line 11
    const/16 v0, 0x8

    .line 12
    .line 13
    invoke-direct {p1, v0}, Lkf2;-><init>(I)V

    .line 14
    .line 15
    .line 16
    const/4 v0, -0x1

    .line 17
    invoke-virtual {p0, v0, p1}, Ltc2;->f(ILqc2;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final onTearDown(Landroid/media/AudioTrack;)V
    .locals 1

    .line 1
    iget-object p0, p0, Lzm;->a:Ljv3;

    .line 2
    .line 3
    iget-object p0, p0, Ljv3;->p:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Lan;

    .line 6
    .line 7
    iget-object p0, p0, Lan;->i:Ltc2;

    .line 8
    .line 9
    new-instance p1, Lkf2;

    .line 10
    .line 11
    const/4 v0, 0x7

    .line 12
    invoke-direct {p1, v0}, Lkf2;-><init>(I)V

    .line 13
    .line 14
    .line 15
    const/4 v0, -0x1

    .line 16
    invoke-virtual {p0, v0, p1}, Ltc2;->f(ILqc2;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method
