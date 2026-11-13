.class public final Ldefpackage/mf2;
.super Ldefpackage/rp;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Ldefpackage/mf2;->b:I

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    invoke-direct {p0, p1}, Ldefpackage/rp;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final u()Ldefpackage/xn3;
    .locals 1

    .line 1
    iget v0, p0, Ldefpackage/mf2;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Ldefpackage/sf4;

    .line 7
    .line 8
    invoke-direct {v0, p0}, Ldefpackage/sf4;-><init>(Ldefpackage/mf2;)V

    .line 9
    .line 10
    .line 11
    return-object v0

    .line 12
    :pswitch_0
    new-instance v0, Ldefpackage/lf2;

    .line 13
    .line 14
    invoke-direct {v0, p0}, Ldefpackage/lf2;-><init>(Ldefpackage/mf2;)V

    .line 15
    .line 16
    .line 17
    return-object v0

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
