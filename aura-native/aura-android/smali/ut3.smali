.class public final synthetic Lut3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lr02;


# virtual methods
.method public final a(Lev3;)Lk14;
    .locals 2

    .line 1
    iget-object p0, p1, Lev3;->e:Loz3;

    .line 2
    .line 3
    invoke-virtual {p0}, Loz3;->a()Lnz3;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const-string v0, "User-Agent"

    .line 8
    .line 9
    const-string v1, "Tempo/1.14.7"

    .line 10
    .line 11
    invoke-virtual {p0, v0, v1}, Lnz3;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    new-instance v0, Loz3;

    .line 15
    .line 16
    invoke-direct {v0, p0}, Loz3;-><init>(Lnz3;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, v0}, Lev3;->b(Loz3;)Lk14;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method
