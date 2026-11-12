.class public final Ls84;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final d:Lue1;

.field public static final e:Lue1;


# instance fields
.field public final a:Ljava/util/ArrayList;

.field public b:I

.field public c:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lr10;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/16 v2, 0x3a

    .line 5
    .line 6
    invoke-direct {v0, v2, v1}, Lr10;-><init>(CI)V

    .line 7
    .line 8
    .line 9
    new-instance v1, Lue1;

    .line 10
    .line 11
    new-instance v2, Lsi1;

    .line 12
    .line 13
    const/16 v3, 0x18

    .line 14
    .line 15
    invoke-direct {v2, v3, v0}, Lsi1;-><init>(ILjava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    invoke-direct {v1, v2}, Lue1;-><init>(Lsi1;)V

    .line 19
    .line 20
    .line 21
    sput-object v1, Ls84;->d:Lue1;

    .line 22
    .line 23
    new-instance v0, Lr10;

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    const/16 v2, 0x2a

    .line 27
    .line 28
    invoke-direct {v0, v2, v1}, Lr10;-><init>(CI)V

    .line 29
    .line 30
    .line 31
    new-instance v1, Lue1;

    .line 32
    .line 33
    new-instance v2, Lsi1;

    .line 34
    .line 35
    invoke-direct {v2, v3, v0}, Lsi1;-><init>(ILjava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    invoke-direct {v1, v2}, Lue1;-><init>(Lsi1;)V

    .line 39
    .line 40
    .line 41
    sput-object v1, Ls84;->e:Lue1;

    .line 42
    .line 43
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Ls84;->a:Ljava/util/ArrayList;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput v0, p0, Ls84;->b:I

    .line 13
    .line 14
    return-void
.end method
