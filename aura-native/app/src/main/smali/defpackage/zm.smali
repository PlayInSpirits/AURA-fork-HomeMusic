.class public final Ldefpackage/zm;
.super Landroid/media/AudioTrack$StreamEventCallback;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final synthetic a:Ldefpackage/jv3;


# direct methods
.method public constructor <init>(Ldefpackage/jv3;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ldefpackage/zm;->a:Ldefpackage/jv3;

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
    iget-object p0, p0, Ldefpackage/zm;->a:Ldefpackage/jv3;

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/jv3;->p:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Ldefpackage/an;

    .line 6
    .line 7
    iget-object p0, p0, Ldefpackage/an;->i:Ldefpackage/tc2;

    .line 8
    .line 9
    new-instance p1, Ldefpackage/kf2;

    .line 10
    .line 11
    const/4 p2, 0x7

    .line 12
    invoke-direct {p1, p2}, Ldefpackage/kf2;-><init>(I)V

    .line 13
    .line 14
    .line 15
    const/4 p2, -0x1

    .line 16
    invoke-virtual {p0, p2, p1}, Ldefpackage/tc2;->f(ILdefpackage/qc2;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final onPresentationEnded(Landroid/media/AudioTrack;)V
    .locals 1

    .line 1
    iget-object p0, p0, Ldefpackage/zm;->a:Ldefpackage/jv3;

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/jv3;->p:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Ldefpackage/an;

    .line 6
    .line 7
    iget-object p0, p0, Ldefpackage/an;->i:Ldefpackage/tc2;

    .line 8
    .line 9
    new-instance p1, Ldefpackage/kf2;

    .line 10
    .line 11
    const/16 v0, 0x8

    .line 12
    .line 13
    invoke-direct {p1, v0}, Ldefpackage/kf2;-><init>(I)V

    .line 14
    .line 15
    .line 16
    const/4 v0, -0x1

    .line 17
    invoke-virtual {p0, v0, p1}, Ldefpackage/tc2;->f(ILdefpackage/qc2;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final onTearDown(Landroid/media/AudioTrack;)V
    .locals 1

    .line 1
    iget-object p0, p0, Ldefpackage/zm;->a:Ldefpackage/jv3;

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/jv3;->p:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Ldefpackage/an;

    .line 6
    .line 7
    iget-object p0, p0, Ldefpackage/an;->i:Ldefpackage/tc2;

    .line 8
    .line 9
    new-instance p1, Ldefpackage/kf2;

    .line 10
    .line 11
    const/4 v0, 0x7

    .line 12
    invoke-direct {p1, v0}, Ldefpackage/kf2;-><init>(I)V

    .line 13
    .line 14
    .line 15
    const/4 v0, -0x1

    .line 16
    invoke-virtual {p0, v0, p1}, Ldefpackage/tc2;->f(ILdefpackage/qc2;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method
