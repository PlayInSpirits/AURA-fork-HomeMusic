.class public final Ldefpackage/il1;
.super Ldefpackage/q42;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/gf1;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ldefpackage/gf1;


# direct methods
.method public synthetic constructor <init>(ILdefpackage/gf1;)V
    .locals 0

    .line 1
    iput p1, p0, Ldefpackage/il1;->n:I

    .line 2
    .line 3
    iput-object p2, p0, Ldefpackage/il1;->o:Ldefpackage/gf1;

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-direct {p0, p1}, Ldefpackage/q42;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Ldefpackage/il1;->n:I

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/il1;->o:Ldefpackage/gf1;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-interface {p0}, Ldefpackage/gf1;->invoke()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    sget-object p0, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 12
    .line 13
    return-object p0

    .line 14
    :pswitch_0
    :try_start_0
    invoke-interface {p0}, Ldefpackage/gf1;->invoke()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    check-cast p0, Ljava/util/List;
    :try_end_0
    .catch Ljavax/net/ssl/SSLPeerUnverifiedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catch_0
    sget-object p0, Ldefpackage/u01;->n:Ldefpackage/u01;

    .line 22
    .line 23
    :goto_0
    return-object p0

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
