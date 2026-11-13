.class public final synthetic Ldefpackage/ke2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ldefpackage/le2;


# direct methods
.method public synthetic constructor <init>(Ldefpackage/le2;I)V
    .locals 0

    .line 1
    iput p2, p0, Ldefpackage/ke2;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Ldefpackage/ke2;->o:Ldefpackage/le2;

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
    .locals 1

    .line 1
    iget p1, p0, Ldefpackage/ke2;->n:I

    .line 2
    .line 3
    const/16 v0, 0x21

    .line 4
    .line 5
    iget-object p0, p0, Ldefpackage/ke2;->o:Ldefpackage/le2;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 11
    .line 12
    if-lt p1, v0, :cond_0

    .line 13
    .line 14
    iget-object p0, p0, Ldefpackage/le2;->m0:Ldefpackage/dc1;

    .line 15
    .line 16
    const-string p1, "android.permission.NEARBY_WIFI_DEVICES"

    .line 17
    .line 18
    invoke-virtual {p0, p1}, Ldefpackage/dc1;->a(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void

    .line 22
    :pswitch_0
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 23
    .line 24
    const/16 v0, 0x25

    .line 25
    .line 26
    if-lt p1, v0, :cond_1

    .line 27
    .line 28
    iget-object p0, p0, Ldefpackage/le2;->m0:Ldefpackage/dc1;

    .line 29
    .line 30
    const-string p1, "android.permission.ACCESS_LOCAL_NETWORK"

    .line 31
    .line 32
    invoke-virtual {p0, p1}, Ldefpackage/dc1;->a(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    :cond_1
    return-void

    .line 36
    :pswitch_1
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 37
    .line 38
    if-lt p1, v0, :cond_2

    .line 39
    .line 40
    iget-object p0, p0, Ldefpackage/le2;->m0:Ldefpackage/dc1;

    .line 41
    .line 42
    const-string p1, "android.permission.POST_NOTIFICATIONS"

    .line 43
    .line 44
    invoke-virtual {p0, p1}, Ldefpackage/dc1;->a(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    :cond_2
    return-void

    .line 48
    :pswitch_2
    iget-object p0, p0, Ldefpackage/le2;->m0:Ldefpackage/dc1;

    .line 49
    .line 50
    const-string p1, "android.permission.INTERNET"

    .line 51
    .line 52
    invoke-virtual {p0, p1}, Ldefpackage/dc1;->a(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    nop

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
