.class public final synthetic Les2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lls2;


# direct methods
.method public synthetic constructor <init>(Lls2;I)V
    .locals 0

    .line 1
    iput p2, p0, Les2;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Les2;->o:Lls2;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget v0, p0, Les2;->n:I

    .line 2
    .line 3
    iget-object p0, p0, Les2;->o:Lls2;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lls2;->g:Ltn2;

    .line 9
    .line 10
    iget-object v0, v0, Ltn2;->l:Landroid/os/Handler;

    .line 11
    .line 12
    new-instance v1, Les2;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    invoke-direct {v1, p0, v2}, Les2;-><init>(Lls2;I)V

    .line 16
    .line 17
    .line 18
    invoke-static {v0, v1}, Lf35;->W(Landroid/os/Handler;Ljava/lang/Runnable;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_0
    invoke-virtual {p0}, Lls2;->O()V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
