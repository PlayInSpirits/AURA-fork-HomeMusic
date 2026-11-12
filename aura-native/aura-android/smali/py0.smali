.class public final enum Lpy0;
.super Ljava/lang/Enum;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lg9;


# static fields
.field public static final synthetic o:[Lpy0;


# instance fields
.field public final n:I


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 1
    new-instance v0, Lpy0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/16 v2, -0x104

    .line 5
    .line 6
    const-string v3, "ED256"

    .line 7
    .line 8
    invoke-direct {v0, v3, v1, v2}, Lpy0;-><init>(Ljava/lang/String;II)V

    .line 9
    .line 10
    .line 11
    new-instance v1, Lpy0;

    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    const/16 v3, -0x105

    .line 15
    .line 16
    const-string v4, "ED512"

    .line 17
    .line 18
    invoke-direct {v1, v4, v2, v3}, Lpy0;-><init>(Ljava/lang/String;II)V

    .line 19
    .line 20
    .line 21
    new-instance v2, Lpy0;

    .line 22
    .line 23
    const/4 v3, 0x2

    .line 24
    const/4 v4, -0x8

    .line 25
    const-string v5, "ED25519"

    .line 26
    .line 27
    invoke-direct {v2, v5, v3, v4}, Lpy0;-><init>(Ljava/lang/String;II)V

    .line 28
    .line 29
    .line 30
    new-instance v3, Lpy0;

    .line 31
    .line 32
    const/4 v4, 0x3

    .line 33
    const/4 v5, -0x7

    .line 34
    const-string v6, "ES256"

    .line 35
    .line 36
    invoke-direct {v3, v6, v4, v5}, Lpy0;-><init>(Ljava/lang/String;II)V

    .line 37
    .line 38
    .line 39
    new-instance v4, Lpy0;

    .line 40
    .line 41
    const/4 v5, 0x4

    .line 42
    const/16 v6, -0x19

    .line 43
    .line 44
    const-string v7, "ECDH_HKDF_256"

    .line 45
    .line 46
    invoke-direct {v4, v7, v5, v6}, Lpy0;-><init>(Ljava/lang/String;II)V

    .line 47
    .line 48
    .line 49
    new-instance v5, Lpy0;

    .line 50
    .line 51
    const/4 v6, 0x5

    .line 52
    const/16 v7, -0x23

    .line 53
    .line 54
    const-string v8, "ES384"

    .line 55
    .line 56
    invoke-direct {v5, v8, v6, v7}, Lpy0;-><init>(Ljava/lang/String;II)V

    .line 57
    .line 58
    .line 59
    new-instance v6, Lpy0;

    .line 60
    .line 61
    const/4 v7, 0x6

    .line 62
    const/16 v8, -0x24

    .line 63
    .line 64
    const-string v9, "ES512"

    .line 65
    .line 66
    invoke-direct {v6, v9, v7, v8}, Lpy0;-><init>(Ljava/lang/String;II)V

    .line 67
    .line 68
    .line 69
    filled-new-array/range {v0 .. v6}, [Lpy0;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    sput-object v0, Lpy0;->o:[Lpy0;

    .line 74
    .line 75
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Lpy0;->n:I

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lpy0;
    .locals 1

    .line 1
    const-class v0, Lpy0;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lpy0;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lpy0;
    .locals 1

    .line 1
    sget-object v0, Lpy0;->o:[Lpy0;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lpy0;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lpy0;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final a()I
    .locals 0

    .line 1
    iget p0, p0, Lpy0;->n:I

    .line 2
    .line 3
    return p0
.end method
