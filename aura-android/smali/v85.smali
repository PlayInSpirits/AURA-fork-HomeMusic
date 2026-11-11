.class public final synthetic Lv85;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Z

.field public final synthetic p:Z

.field public final synthetic q:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ZZI)V
    .locals 0

    .line 1
    iput p4, p0, Lv85;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lv85;->q:Ljava/lang/Object;

    .line 4
    .line 5
    iput-boolean p2, p0, Lv85;->o:Z

    .line 6
    .line 7
    iput-boolean p3, p0, Lv85;->p:Z

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget v0, p0, Lv85;->n:I

    .line 2
    .line 3
    iget-boolean v1, p0, Lv85;->p:Z

    .line 4
    .line 5
    iget-boolean v2, p0, Lv85;->o:Z

    .line 6
    .line 7
    iget-object p0, p0, Lv85;->q:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Ly10;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, Ly10;->d:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, Lrf2;

    .line 17
    .line 18
    invoke-virtual {p0, v2, v1}, Lrf2;->n(ZZ)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_0
    iget-object p0, p0, Ly10;->d:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast p0, Lxc5;

    .line 25
    .line 26
    invoke-static {p0, v2, v1}, Lxc5;->l(Lxc5;ZZ)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
