.class public final synthetic Ldefpackage/el3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ldefpackage/fl3;


# direct methods
.method public synthetic constructor <init>(Ldefpackage/fl3;I)V
    .locals 0

    .line 1
    iput p2, p0, Ldefpackage/el3;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Ldefpackage/el3;->o:Ldefpackage/fl3;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    iget p1, p0, Ldefpackage/el3;->n:I

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/el3;->o:Ldefpackage/fl3;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    packed-switch p1, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v0, v0}, Ldefpackage/pp0;->i0(ZZ)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :pswitch_0
    new-instance p1, Landroid/os/Bundle;

    .line 14
    .line 15
    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Ldefpackage/fl3;->C0:Ldefpackage/gl3;

    .line 19
    .line 20
    iget-object v1, v1, Ldefpackage/gl3;->e:Ljava/util/ArrayList;

    .line 21
    .line 22
    const-string v2, "TRACKS_OBJECT"

    .line 23
    .line 24
    invoke-virtual {p1, v2, v1}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 25
    .line 26
    .line 27
    new-instance v1, Ldefpackage/sl3;

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    invoke-direct {v1, v0, v2}, Ldefpackage/sl3;-><init>(ILjava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, p1}, Ldefpackage/kc1;->c0(Landroid/os/Bundle;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Ldefpackage/kc1;->X()Ldefpackage/nc1;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {p1}, Ldefpackage/nc1;->k()Ldefpackage/md1;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-virtual {v1, p1, v2}, Ldefpackage/pp0;->m0(Ldefpackage/ld1;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0, v0, v0}, Ldefpackage/pp0;->i0(ZZ)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
