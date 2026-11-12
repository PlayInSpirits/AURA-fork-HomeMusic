.class public final Lcom/eddyizm/tempus/subsonic/base/ApiResponse;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private subsonicResponse:Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;
    .annotation runtime Lka4;
        value = "subsonic-response"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 5
    .line 6
    invoke-direct {v0}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;-><init>()V

    .line 7
    .line 8
    .line 9
    sget-object v1, Lcom/eddyizm/tempus/subsonic/models/ResponseStatus;->FAILED:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->setStatus(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->subsonicResponse:Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->subsonicResponse:Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 2
    .line 3
    return-object p0
.end method

.method public final setSubsonicResponse(Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->subsonicResponse:Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 5
    .line 6
    return-void
.end method
