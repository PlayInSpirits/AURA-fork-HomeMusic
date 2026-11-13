.class public final synthetic Ldefpackage/bt1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/gf1;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ljava/lang/String;

.field public final synthetic p:Ldefpackage/jx3;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ldefpackage/jx3;I)V
    .locals 0

    .line 1
    iput p3, p0, Ldefpackage/bt1;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Ldefpackage/bt1;->o:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p2, p0, Ldefpackage/bt1;->p:Ldefpackage/jx3;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Ldefpackage/bt1;->n:I

    .line 2
    .line 3
    iget-object v1, p0, Ldefpackage/bt1;->p:Ldefpackage/jx3;

    .line 4
    .line 5
    iget-object p0, p0, Ldefpackage/bt1;->o:Ljava/lang/String;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v0, v1, Ldefpackage/jx3;->n:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Lcom/eddyizm/tempus/homemusic/WaveNextIn;

    .line 13
    .line 14
    invoke-static {p0, v0}, Ldefpackage/rr1;->z(Ljava/lang/String;Lcom/eddyizm/tempus/homemusic/WaveNextIn;)Lcom/eddyizm/tempus/homemusic/WaveOut;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0

    .line 19
    :pswitch_0
    iget-object v0, v1, Ldefpackage/jx3;->n:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Lcom/eddyizm/tempus/homemusic/SmartNextIn;

    .line 22
    .line 23
    invoke-static {p0, v0}, Ldefpackage/rr1;->v(Ljava/lang/String;Lcom/eddyizm/tempus/homemusic/SmartNextIn;)Lcom/eddyizm/tempus/homemusic/SmartOut;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
