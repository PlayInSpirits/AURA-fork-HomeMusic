.class public final Ld20;
.super Lu22;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lc20;


# instance fields
.field public final u:La32;


# direct methods
.method public constructor <init>(La32;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lzd2;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ld20;->u:La32;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Throwable;)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Lu22;->q()La32;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1}, La32;->y(Ljava/lang/Throwable;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final r()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final s(Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    iget-object p1, p0, Ld20;->u:La32;

    .line 2
    .line 3
    invoke-virtual {p0}, Lu22;->q()La32;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p1, p0}, La32;->o(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    return-void
.end method
