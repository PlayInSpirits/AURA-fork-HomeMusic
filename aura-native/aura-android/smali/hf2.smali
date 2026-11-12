.class public final enum Lhf2;
.super Ljava/lang/Enum;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final enum n:Lhf2;

.field public static final enum o:Lhf2;

.field public static final enum p:Lhf2;

.field public static final synthetic q:[Lhf2;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lhf2;

    .line 2
    .line 3
    const-string v1, "IsPlacedInLookahead"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lhf2;->n:Lhf2;

    .line 10
    .line 11
    new-instance v1, Lhf2;

    .line 12
    .line 13
    const-string v2, "IsPlacedInApproach"

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lhf2;->o:Lhf2;

    .line 20
    .line 21
    new-instance v2, Lhf2;

    .line 22
    .line 23
    const-string v3, "IsNotPlaced"

    .line 24
    .line 25
    const/4 v4, 0x2

    .line 26
    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v2, Lhf2;->p:Lhf2;

    .line 30
    .line 31
    filled-new-array {v0, v1, v2}, [Lhf2;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sput-object v0, Lhf2;->q:[Lhf2;

    .line 36
    .line 37
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lhf2;
    .locals 1

    .line 1
    const-class v0, Lhf2;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lhf2;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lhf2;
    .locals 1

    .line 1
    sget-object v0, Lhf2;->q:[Lhf2;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lhf2;

    .line 8
    .line 9
    return-object v0
.end method
