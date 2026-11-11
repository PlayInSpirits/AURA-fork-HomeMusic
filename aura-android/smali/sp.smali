.class public final synthetic Lsp;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lcom/eddyizm/tempus/service/MediaService;


# direct methods
.method public synthetic constructor <init>(Lcom/eddyizm/tempus/service/MediaService;I)V
    .locals 0

    .line 1
    iput p2, p0, Lsp;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lsp;->o:Lcom/eddyizm/tempus/service/MediaService;

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
    .locals 2

    .line 1
    iget v0, p0, Lsp;->n:I

    .line 2
    .line 3
    iget-object p0, p0, Lsp;->o:Lcom/eddyizm/tempus/service/MediaService;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, Lrs3;->a:Lrs3;

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/eddyizm/tempus/service/MediaService;->p()Lkn2;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v1}, Lkn2;->a()Lqi3;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p0, v1}, Lrs3;->c(Landroid/content/Context;Lqi3;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :pswitch_0
    invoke-virtual {p0}, Lcom/eddyizm/tempus/service/MediaService;->n()V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
