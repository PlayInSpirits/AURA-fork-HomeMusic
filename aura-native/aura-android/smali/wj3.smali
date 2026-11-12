.class public final synthetic Lwj3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/util/function/Supplier;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;I)V
    .locals 0

    .line 1
    iput p2, p0, Lwj3;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lwj3;->b:Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lwj3;->a:I

    .line 2
    .line 3
    iget-object p0, p0, Lwj3;->b:Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->l0:Li61;

    .line 9
    .line 10
    iget-object p0, p0, Li61;->p:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Landroidx/media3/ui/PlayerControlView;

    .line 13
    .line 14
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerControlView;->getPlayer()Lqi3;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0

    .line 19
    :pswitch_0
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->L0:Laj3;

    .line 20
    .line 21
    iget-object p0, p0, Laj3;->n:Lk03;

    .line 22
    .line 23
    invoke-virtual {p0}, Lad2;->d()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 28
    .line 29
    return-object p0

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
