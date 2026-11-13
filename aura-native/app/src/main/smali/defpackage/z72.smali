.class public final Ldefpackage/z72;
.super Ldefpackage/cx2;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/u62;


# static fields
.field public static final E:Ldefpackage/x72;


# instance fields
.field public B:Ldefpackage/dc3;

.field public C:Ldefpackage/hg3;

.field public D:Ldefpackage/hb3;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ldefpackage/x72;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ldefpackage/z72;->E:Ldefpackage/x72;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final q0(Ldefpackage/v72;I)Z
    .locals 4

    .line 1
    const/4 v0, 0x5

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x1

    .line 4
    if-ne p2, v0, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v0, 0x6

    .line 8
    if-ne p2, v0, :cond_1

    .line 9
    .line 10
    :goto_0
    iget-object v0, p0, Ldefpackage/z72;->D:Ldefpackage/hb3;

    .line 11
    .line 12
    sget-object v3, Ldefpackage/hb3;->o:Ldefpackage/hb3;

    .line 13
    .line 14
    if-ne v0, v3, :cond_5

    .line 15
    .line 16
    goto :goto_4

    .line 17
    :cond_1
    const/4 v0, 0x3

    .line 18
    if-ne p2, v0, :cond_2

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_2
    const/4 v0, 0x4

    .line 22
    if-ne p2, v0, :cond_3

    .line 23
    .line 24
    :goto_1
    iget-object v0, p0, Ldefpackage/z72;->D:Ldefpackage/hb3;

    .line 25
    .line 26
    sget-object v3, Ldefpackage/hb3;->n:Ldefpackage/hb3;

    .line 27
    .line 28
    if-ne v0, v3, :cond_5

    .line 29
    .line 30
    goto :goto_4

    .line 31
    :cond_3
    if-ne p2, v2, :cond_4

    .line 32
    .line 33
    goto :goto_2

    .line 34
    :cond_4
    const/4 v0, 0x2

    .line 35
    if-ne p2, v0, :cond_8

    .line 36
    .line 37
    :cond_5
    :goto_2
    invoke-virtual {p0, p2}, Ldefpackage/z72;->r0(I)Z

    .line 38
    .line 39
    .line 40
    move-result p2

    .line 41
    if-eqz p2, :cond_6

    .line 42
    .line 43
    iget p1, p1, Ldefpackage/v72;->b:I

    .line 44
    .line 45
    iget-object p0, p0, Ldefpackage/z72;->B:Ldefpackage/dc3;

    .line 46
    .line 47
    iget-object p0, p0, Ldefpackage/dc3;->a:Ldefpackage/lm0;

    .line 48
    .line 49
    invoke-virtual {p0}, Ldefpackage/lm0;->n()I

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    sub-int/2addr p0, v2

    .line 54
    if-ge p1, p0, :cond_7

    .line 55
    .line 56
    goto :goto_3

    .line 57
    :cond_6
    iget p0, p1, Ldefpackage/v72;->a:I

    .line 58
    .line 59
    if-lez p0, :cond_7

    .line 60
    .line 61
    :goto_3
    return v2

    .line 62
    :cond_7
    :goto_4
    return v1

    .line 63
    :cond_8
    const-string p0, "Lazy list does not support beyond bounds layout for the specified direction"

    .line 64
    .line 65
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    return v1
.end method

.method public final r(Ldefpackage/cf2;Ldefpackage/pi2;J)Ldefpackage/vi2;
    .locals 1

    .line 1
    invoke-interface {p2, p3, p4}, Ldefpackage/pi2;->r(J)Ldefpackage/jg3;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget p2, p0, Ldefpackage/jg3;->n:I

    .line 6
    .line 7
    iget p3, p0, Ldefpackage/jg3;->o:I

    .line 8
    .line 9
    new-instance p4, Ldefpackage/la;

    .line 10
    .line 11
    const/4 v0, 0x2

    .line 12
    invoke-direct {p4, p0, v0}, Ldefpackage/la;-><init>(Ldefpackage/jg3;I)V

    .line 13
    .line 14
    .line 15
    sget-object p0, Ldefpackage/v01;->n:Ldefpackage/v01;

    .line 16
    .line 17
    invoke-interface {p1, p2, p3, p0, p4}, Ldefpackage/wi2;->v(IILjava/util/Map;Ldefpackage/if1;)Ldefpackage/vi2;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method

.method public final r0(I)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    if-ne p1, v1, :cond_0

    .line 4
    .line 5
    return v0

    .line 6
    :cond_0
    const/4 v2, 0x2

    .line 7
    if-ne p1, v2, :cond_1

    .line 8
    .line 9
    return v1

    .line 10
    :cond_1
    const/4 v2, 0x5

    .line 11
    if-ne p1, v2, :cond_2

    .line 12
    .line 13
    return v0

    .line 14
    :cond_2
    const/4 v2, 0x6

    .line 15
    if-ne p1, v2, :cond_3

    .line 16
    .line 17
    return v1

    .line 18
    :cond_3
    const/4 v2, 0x3

    .line 19
    if-ne p1, v2, :cond_6

    .line 20
    .line 21
    invoke-static {p0}, Ldefpackage/j51;->O(Ldefpackage/eo0;)Ldefpackage/c72;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    iget-object p0, p0, Ldefpackage/c72;->K:Ldefpackage/r62;

    .line 26
    .line 27
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    if-eqz p0, :cond_5

    .line 32
    .line 33
    if-ne p0, v1, :cond_4

    .line 34
    .line 35
    return v1

    .line 36
    :cond_4
    invoke-static {}, Ldefpackage/er1;->n()V

    .line 37
    .line 38
    .line 39
    :goto_0
    const/4 p0, 0x0

    .line 40
    return p0

    .line 41
    :cond_5
    return v0

    .line 42
    :cond_6
    const/4 v2, 0x4

    .line 43
    if-ne p1, v2, :cond_9

    .line 44
    .line 45
    invoke-static {p0}, Ldefpackage/j51;->O(Ldefpackage/eo0;)Ldefpackage/c72;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    iget-object p0, p0, Ldefpackage/c72;->K:Ldefpackage/r62;

    .line 50
    .line 51
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    if-eqz p0, :cond_8

    .line 56
    .line 57
    if-ne p0, v1, :cond_7

    .line 58
    .line 59
    return v0

    .line 60
    :cond_7
    invoke-static {}, Ldefpackage/er1;->n()V

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_8
    return v1

    .line 65
    :cond_9
    const-string p0, "Lazy list does not support beyond bounds layout for the specified direction"

    .line 66
    .line 67
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    goto :goto_0
.end method

.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ldefpackage/cx2;-><init>()V

    return-void
.end method
