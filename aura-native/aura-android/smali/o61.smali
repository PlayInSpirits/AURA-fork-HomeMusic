.class public final Lo61;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:I

.field public final o:Li61;

.field public final p:Lcom/eddyizm/tempus/model/Favorite;


# direct methods
.method public synthetic constructor <init>(Li61;Lcom/eddyizm/tempus/model/Favorite;I)V
    .locals 0

    .line 1
    iput p3, p0, Lo61;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lo61;->o:Li61;

    .line 4
    .line 5
    iput-object p2, p0, Lo61;->p:Lcom/eddyizm/tempus/model/Favorite;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget v0, p0, Lo61;->n:I

    .line 2
    .line 3
    iget-object v1, p0, Lo61;->p:Lcom/eddyizm/tempus/model/Favorite;

    .line 4
    .line 5
    iget-object p0, p0, Lo61;->o:Li61;

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    const/4 v3, 0x0

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Li61;->o:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Ls24;

    .line 15
    .line 16
    new-instance v4, Lg61;

    .line 17
    .line 18
    invoke-direct {v4, p0, v1, v3}, Lg61;-><init>(Li61;Lcom/eddyizm/tempus/model/Favorite;I)V

    .line 19
    .line 20
    .line 21
    invoke-static {v0, v3, v2, v4}, Lxl;->E(Ls24;ZZLif1;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :pswitch_0
    iget-object v0, p0, Li61;->o:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, Ls24;

    .line 28
    .line 29
    new-instance v4, Lg61;

    .line 30
    .line 31
    invoke-direct {v4, p0, v1, v2}, Lg61;-><init>(Li61;Lcom/eddyizm/tempus/model/Favorite;I)V

    .line 32
    .line 33
    .line 34
    invoke-static {v0, v3, v2, v4}, Lxl;->E(Ls24;ZZLif1;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
