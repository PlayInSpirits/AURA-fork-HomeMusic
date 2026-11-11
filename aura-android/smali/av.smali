.class public final synthetic Lav;
.super Lig1;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lgf1;


# instance fields
.field public final synthetic n:Lcv;

.field public final synthetic o:Lf63;

.field public final synthetic p:Lfa;


# direct methods
.method public constructor <init>(Lcv;Lf63;Lfa;)V
    .locals 6

    .line 1
    iput-object p1, p0, Lav;->n:Lcv;

    .line 2
    .line 3
    iput-object p2, p0, Lav;->o:Lf63;

    .line 4
    .line 5
    iput-object p3, p0, Lav;->p:Lfa;

    .line 6
    .line 7
    const-string v4, "bringIntoView$localRect(Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;Landroidx/compose/ui/layout/LayoutCoordinates;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/geometry/Rect;"

    .line 8
    .line 9
    const/4 v5, 0x0

    .line 10
    const/4 v1, 0x0

    .line 11
    const-class v2, Lg12;

    .line 12
    .line 13
    const-string v3, "localRect"

    .line 14
    .line 15
    move-object v0, p0

    .line 16
    invoke-direct/range {v0 .. v5}, Lig1;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lav;->o:Lf63;

    .line 2
    .line 3
    iget-object v1, p0, Lav;->p:Lfa;

    .line 4
    .line 5
    iget-object p0, p0, Lav;->n:Lcv;

    .line 6
    .line 7
    invoke-static {p0, v0, v1}, Lcv;->q0(Lcv;Lf63;Lfa;)Lwv3;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method
