.class public final Ldefpackage/n73;
.super Ldefpackage/bz4;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final b:Ldefpackage/m73;


# instance fields
.field public final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ldefpackage/n73;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-direct {v0, v1}, Ldefpackage/n73;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v1, Ldefpackage/m73;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-direct {v1, v0, v2}, Ldefpackage/m73;-><init>(Ldefpackage/bz4;I)V

    .line 11
    .line 12
    .line 13
    sput-object v1, Ldefpackage/n73;->b:Ldefpackage/m73;

    .line 14
    .line 15
    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Ldefpackage/n73;->a:I

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Ldefpackage/l32;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ldefpackage/l32;->e0()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Ldefpackage/xa3;->w(I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x5

    .line 10
    if-eq v1, v2, :cond_1

    .line 11
    .line 12
    const/4 v2, 0x6

    .line 13
    if-eq v1, v2, :cond_1

    .line 14
    .line 15
    const/16 p0, 0x8

    .line 16
    .line 17
    if-ne v1, p0, :cond_0

    .line 18
    .line 19
    invoke-virtual {p1}, Ldefpackage/l32;->a0()V

    .line 20
    .line 21
    .line 22
    const/4 p0, 0x0

    .line 23
    return-object p0

    .line 24
    :cond_0
    new-instance p0, Lcom/google/gson/JsonSyntaxException;

    .line 25
    .line 26
    invoke-static {v0}, Ldefpackage/b11;->x(I)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {p1}, Ldefpackage/l32;->v()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    new-instance v1, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    const-string v2, "Expecting number, got: "

    .line 37
    .line 38
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string v0, "; at path "

    .line 45
    .line 46
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw p0

    .line 60
    :cond_1
    iget p0, p0, Ldefpackage/n73;->a:I

    .line 61
    .line 62
    invoke-static {p0, p1}, Ldefpackage/f34;->b(ILdefpackage/l32;)Ljava/lang/Number;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    return-object p0
.end method

.method public final b(Ldefpackage/q32;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Ljava/lang/Number;

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Ldefpackage/q32;->T(Ljava/lang/Number;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
