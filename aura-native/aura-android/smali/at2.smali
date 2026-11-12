.class public final synthetic Lat2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lit2;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lit2;


# direct methods
.method public synthetic constructor <init>(Lit2;I)V
    .locals 0

    .line 1
    iput p2, p0, Lat2;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lat2;->o:Lit2;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final h(Ltn2;Lfr2;I)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lat2;->n:I

    .line 2
    .line 3
    iget-object p0, p0, Lat2;->o:Lit2;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, Lvl2;

    .line 9
    .line 10
    const/4 v1, 0x4

    .line 11
    invoke-direct {v0, p1, p2, p3, v1}, Lvl2;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    .line 12
    .line 13
    .line 14
    invoke-static {p1, p2, p3, p0, v0}, Lkt2;->K0(Ltn2;Lfr2;ILit2;Lwc0;)Lic2;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0

    .line 19
    :pswitch_0
    new-instance v0, Lq31;

    .line 20
    .line 21
    const/4 v1, 0x5

    .line 22
    invoke-direct {v0, p3, v1, p2}, Lq31;-><init>(IILjava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    invoke-static {p1, p2, p3, p0, v0}, Lkt2;->K0(Ltn2;Lfr2;ILit2;Lwc0;)Lic2;

    .line 26
    .line 27
    .line 28
    move-result-object p0

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
